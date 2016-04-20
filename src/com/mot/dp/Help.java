package com.mot.dp;

/**
 * Created by mot on 4/7/16.
 */
public class Help {

    public static String getHelpContext(){
        StringBuilder sb =new StringBuilder();
        sb.append("<head></head>");
        sb.append("<body>");

        buildUserValidateContext(sb);

        buildDPBindingContext(sb);
        buildDPUnBindingContext(sb);
        buildDPNameVerificationContext(sb);

        buildUploadSettingProfileContext(sb);
        buildSetDPConfigContext(sb);
        buildGetDPConfigContext(sb);

        buildReportDPStatusContext(sb);
        buildDPStatusContext(sb);


        sb.append("</body>");
        return sb.toString();
    }

    static String urlBase="http://yxzhm.com/api/DP/";

    private static void buildUserValidateContext(StringBuilder sb){
        sb.append(getH1("User Verification"));
        sb.append(getH3(urlBase+"Login"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }

    private static void buildGetAllDPNameContext(StringBuilder sb){
        sb.append(getH1("Get All DP Names"));
        sb.append(getH3(urlBase+"GetAllDPNames"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}"));
        sb.append(getH3("Return json"));
        sb.append("<p/>");
    }

    private static void buildDPBindingContext(StringBuilder sb){
        sb.append(getH1("Binding DP"));
        sb.append(getH3(urlBase+"Binding"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }
    private static void buildDPUnBindingContext(StringBuilder sb){
        sb.append(getH1("UnBinding DP"));
        sb.append(getH3(urlBase+"UnBinding"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }

    private static void buildDPNameVerificationContext(StringBuilder sb){
        sb.append(getH1("Verify DP Name Exist or not"));
        sb.append(getH3(urlBase+"CheckDPExist"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }

    private static void buildUploadSettingProfileContext(StringBuilder sb){
        sb.append(getH1("Upload DP Setting"));
        sb.append(getH3(urlBase+"UploadSetting"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}&settingprofilename={2}&setting={3}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }


    private static void buildSetDPConfigContext(StringBuilder sb){
        sb.append(getH1("Set DP Config"));
        sb.append(getH3(urlBase+"SetDPConfig"));
        sb.append(getH3("Method=POST"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}&settingprofilename={3}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }

    private static void buildGetDPConfigContext(StringBuilder sb){
        sb.append(getH1("Get DP Config"));
        sb.append(getH3(urlBase+"GetDPConfig"));
        sb.append(getH3("Method=Get"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}"));
        sb.append(getH3("Return json"));
        sb.append("<p/>");
    }

    private static void buildDPStatusContext(StringBuilder sb){
        sb.append(getH1("Query DP Status"));
        sb.append(getH3(urlBase+"QueryDPStatus"));
        sb.append(getH3("Method=Get"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}"));
        sb.append(getH3("Return json"));
        sb.append("<p/>");
    }

    private static void buildReportDPStatusContext(StringBuilder sb){
        sb.append(getH1("Report DP Status"));
        sb.append(getH3(urlBase+"ReportDPStatus"));
        sb.append(getH3("Method=Post"));
        sb.append(getH3("Parameters loginname={0}&password={1}&dpname={2}&status={3}"));
        sb.append(getH3("Return boolean"));
        sb.append("<p/>");
    }

    private static String getH1(String s){
        return "<h1>"+s+"</h1>";
    }
    private static String getH3(String s){
        return "<h3>"+s+"</h3>";
    }
}