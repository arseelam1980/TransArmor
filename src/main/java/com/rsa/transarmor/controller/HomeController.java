package com.rsa.transarmor.controller;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsa.transarmor.dto.GMFMessageVariants;
import com.rsa.transarmor.exception.DataProcessingException;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	String XSD_FILE_NAME = "src/main/resources/com/firstdata/Merchant/gmfV3.10/UMF_Schema_V2.03d.16V2.xsd";

	// TBD: need to remove this after integration. as this value comes in a post
	// request
	/*
	 * static String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
	 * "<GMF xmlns=\"com/firstdata/Merchant/gmfV3.10\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
	 * + "	<CreditRequest>" + "		<CommonGrp>" + "			<PymtType>Credit</PymtType>"
	 * + "			<TxnType>Authorization</TxnType>" +
	 * "			<LocalDateTime>20140717013358</LocalDateTime>" +
	 * "			<TrnmsnDateTime>20140717013358</TrnmsnDateTime>" +
	 * "			<STAN>369948</STAN>" + "			<RefNum>237743650711</RefNum>" +
	 * "			<OrderNum>787376464313</OrderNum>" + "			<TPPID>RHO001</TPPID>" +
	 * "			<TermID>00000001</TermID>" + "			<MerchID>000064</MerchID>" +
	 * "			<MerchCatCode>5812</MerchCatCode>" +
	 * "			<POSEntryMode>901</POSEntryMode>" +
	 * "			<POSCondCode>00</POSCondCode>" + "			<TermCatCode>01</TermCatCode>" +
	 * "			<TermEntryCapablt>04</TermEntryCapablt>" + "			<TxnAmt>6196</TxnAmt>"
	 * + "			<TxnCrncy>840</TxnCrncy>" + "			<TermLocInd>0</TermLocInd>" +
	 * "			<CardCaptCap>1</CardCaptCap>" + "			<GroupID>20001</GroupID>" +
	 * "		</CommonGrp>" + "		<CardGrp>" +
	 * "			<!--	Both AcctNum and Track2Data are not allowed. Need to remove AcctNum -->"
	 * + "			<AcctNum>6240000006438714</AcctNum>" +
	 * "			<Track2Data>6240000006438714=181210123456789</Track2Data>" +
	 * "			<CardType>Discover</CardType>" + "		</CardGrp>" + "		<AddtlAmtGrp>" +
	 * "			<PartAuthrztnApprvlCapablt>1</PartAuthrztnApprvlCapablt>" +
	 * "		</AddtlAmtGrp>" + "	</CreditRequest>" + "</GMF>";
	 */


static String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><GMF xmlns=\"com/firstdata/Merchant/gmfV3.10\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><CheckResponse><CommonGrp><PymtType>Check</PymtType><TxnType>Authorization</TxnType><LocalDateTime>20140815014848</LocalDateTime><TrnmsnDateTime>20140815154851</TrnmsnDateTime><STAN>836731</STAN><RefNum>48964487</RefNum><TermID>00000001</TermID><MerchID>RCTST0000000063</MerchID><TxnAmt>112</TxnAmt><TxnCrncy>840</TxnCrncy></CommonGrp><RespGrp><RespCode>000</RespCode><AuthID>OK96  </AuthID><AddtlRespData>APPROVED 123456 </AddtlRespData></RespGrp></CheckResponse></GMF>";
	


	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws DataProcessingException 
	 */
	@RequestMapping(value = "/createGIM", method = RequestMethod.POST)
	public String home(Locale locale, Model model) throws DataProcessingException {
		logger.info("Welcome home! The client locale is {}.", locale);

		try {
			//TBD: XMLData needs be passed from HTTP Post request.
			createGIMObject(xmlData);
		} catch (DataProcessingException e) {
			logger.error("Error while creating the GIM object", e);
			throw new DataProcessingException(
					"Error while creating the GIM object");
		}

		return "home";
	}

	/**
	 * This method first validates the input XML against the XSD. If it is valid
	 * input xml, then creates the GIM object.
	 * 
	 * @return
	 * @throws DataProcessingException
	 */
	public GMFMessageVariants createGIMObject(String xmlData)
			throws DataProcessingException {
		GMFMessageVariants gmf = null;
		StringReader xmlDataReader = new StringReader(xmlData);
		try {
			if (validateXMLSchema(XSD_FILE_NAME, xmlDataReader)) {
				logger.info("The input XML against XSD is Validated Successfully");
				gmf = parseInputXML(xmlData);
			} else {
				logger.info("The input xml against xsd is NOT VALID");
				throw new DataProcessingException(
						"The input xml against xsd is NOT VALID");
			}
		} catch (Exception e) {
			logger.error("Error while creating the GIM object", e);
			throw new DataProcessingException(
					"Error while creating the GIM object");
		} finally {
			xmlDataReader.close();
		}
		return gmf;

	}

	/**
	 * This method will parse the input XML for credit request and returns a GIM
	 * object.
	 * 
	 * @throws DataProcessingException
	 */
	private GMFMessageVariants parseInputXML(String xmlData)
			throws DataProcessingException {
		GMFMessageVariants gmf = null;
		StringReader xmlDataReader = new StringReader(xmlData);
		try {

			JAXBContext jaxbContext = JAXBContext
					.newInstance(GMFMessageVariants.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			// TBD: we need to change this object to GIM.
			gmf = (GMFMessageVariants) jaxbUnmarshaller
					.unmarshal(xmlDataReader);
		} catch (JAXBException e) {
			logger.error("Error while parsing the input XML", e);
			throw new DataProcessingException(
					"Error while parsing the input XML");

		} finally {
			xmlDataReader.close();
		}
		return gmf;
	}

	/**
	 * This method will validate the XML against the given XSD file
	 * 
	 * @param xsdPath
	 * @param xmlPath
	 * @return
	 */
	private static boolean validateXMLSchema(String xsdPath,
			StringReader xmlDataReader) {

		logger.info("Validating the XML against XSD");
		try {
			SchemaFactory factory = SchemaFactory
					.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(xmlDataReader));
		} catch (Exception e) {
			logger.error("Error validating XML against XSD", e);
			return false;
		}
		return true;
	}

/*	public static void main(String[] args) throws DataProcessingException {

		HomeController hc = new HomeController();
		hc.createGIMObject(xmlData);

	}*/
}