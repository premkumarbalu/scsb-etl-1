package org.recap.model.csv;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.OneToMany;

import java.io.Serializable;
import java.util.List;

/**
 * Created by premkb on 30/9/16.
 */
@CsvRecord(generateHeaderColumns = true, separator = ",", quoting = true, crlf = "UNIX")
public class DataDumpSuccessReport implements Serializable{

    @DataField(pos = 1, columnName = "Institution Code")
    private String institutionCodes;
    @DataField(pos = 2, columnName = "Requesting Institution Code")
    private String requestingInstitution;
    @DataField(pos = 3, columnName = "Fetch Type")
    private String fetchType;
    @DataField(pos = 4, columnName = "Export From Date")
    private String exportFromDate;
    @DataField(pos = 5, columnName = "Collection Group Id(s)")
    private String collectionGroupIds;
    @DataField(pos = 6, columnName = "Transmission Type")
    private String transmissionType;
    @DataField(pos = 7, columnName = "Export Format")
    private String exportFormat;
    @DataField(pos = 8, columnName = "To Email Id(s)")
    private String toEmailId;
    @DataField(pos = 9, columnName = "No of Bibs Exported")
    private String noOfBibsExported;


    @Ignore
    private String fileName;

    @Ignore
    private String reportType;

    @Ignore
    private String institutionName;

    @OneToMany(mappedTo = "org.recap.model.csv.DataDumpSuccessReport")
    List<DataDumpSuccessReport> dataDumpSuccessReportList;

    public String getInstitutionCodes() {
        return institutionCodes;
    }

    public void setInstitutionCodes(String institutionCodes) {
        this.institutionCodes = institutionCodes;
    }

    public String getRequestingInstitution() {
        return requestingInstitution;
    }

    public void setRequestingInstitution(String requestingInstitution) {
        this.requestingInstitution = requestingInstitution;
    }

    public String getFetchType() {
        return fetchType;
    }

    public void setFetchType(String fetchType) {
        this.fetchType = fetchType;
    }

    public String getExportFromDate() {
        return exportFromDate;
    }

    public void setExportFromDate(String exportFromDate) {
        this.exportFromDate = exportFromDate;
    }

    public String getCollectionGroupIds() {
        return collectionGroupIds;
    }

    public void setCollectionGroupIds(String collectionGroupIds) {
        this.collectionGroupIds = collectionGroupIds;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getNoOfBibsExported() {
        return noOfBibsExported;
    }

    public void setNoOfBibsExported(String noOfBibsExported) {
        this.noOfBibsExported = noOfBibsExported;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getExportFormat() {
        return exportFormat;
    }

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    public List<DataDumpSuccessReport> getDataDumpSuccessReportList() {
        return dataDumpSuccessReportList;
    }

    public void setDataDumpSuccessReportList(List<DataDumpSuccessReport> dataDumpSuccessReportList) {
        this.dataDumpSuccessReportList = dataDumpSuccessReportList;
    }
}
