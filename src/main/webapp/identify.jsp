<%@ page language="java"
         import="com.iotsec.tobacco.javabean.Record,java.util.ArrayList"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <meta http-equiv="imagetoolbar" content="no">
    <link href="resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet">
    <link href="resources/css/axure_rp_page.css" type="text/css" rel="stylesheet">
    <link href="identify_files/axurerp_pagespecificstyles.css" type="text/css" rel="stylesheet">
    <!--[if IE 6]>
    <link href="identify_files/axurerp_pagespecificstyles_ie6.css" type="text/css" rel="stylesheet">
    <![endif]-->
    <SCRIPT src="resources/scripts/jquery-1.4.2.min.js"></SCRIPT>
    <SCRIPT src="resources/scripts/jquery-ui-1.8.10.custom.min.js"></SCRIPT>
    <SCRIPT src="resources/scripts/axurerp_beforepagescript.js"></SCRIPT>
    <SCRIPT src="resources/scripts/messagecenter.js"></SCRIPT>
</head>

<%
    ArrayList<Record> list = (ArrayList<Record>) request
            .getAttribute("list");
    Record record;
    if(list==null || list.size()==0){
         record=new Record("","假冒","未知","未知","未知","","",0);
    }else{
         record=list.get(0);
    }

%>

<body>

<BODY>
<DIV class="main_container">

<DIV id=u0_container class="u0_container">
    <DIV id="u0_img" class="u0_original"></DIV>
    <DIV id=u1 class="u1">
        <DIV id=u1_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<IMG id=u0 src="resources/images/transparent.gif" class="u0">

<DIV id=u2_container class="u2_container">
    <DIV id="u2_img" class="u2_original"></DIV>
    <DIV id=u3 class="u3">
        <DIV id=u3_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<IMG id=u2 src="resources/images/transparent.gif" class="u2">

<DIV id=u4
     style="border-style:dotted; border-color:red; visibility:hidden;; position:absolute; left:0px; top:0px; width:330px; height:100px;;"></div>
<DIV id=u5_text class="u5_text">
    <DIV id=u5_rtf><p style="text-align:center;"><span
            style="font-family:微软雅黑;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">品牌</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u5 src="resources/images/transparent.gif" class="u5">

<DIV id=u6_text class="u6_text">
    <DIV id=u6_rtf><p style="text-align:center;"><span
            style="font-family:微软雅黑;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">宣传</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u6 src="resources/images/transparent.gif" class="u6">

<DIV id=u7_text class="u7_text">
    <DIV id=u7_rtf><p style="text-align:center;"><span
            style="font-family:微软雅黑;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">会员</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u7 src="resources/images/transparent.gif" class="u7">

<DIV id=u8_text class="u8_text">
    <DIV id=u8_rtf><p style="text-align:center;"><span
            style="font-family:微软雅黑;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#FFFFFF;">更多</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u8 src="resources/images/transparent.gif" class="u8">

<DIV id=u9_container class="u9_container">
    <DIV id="u9_img" class="u9_original"></DIV>
    <DIV id=u10 class="u10">
        <DIV id=u10_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<IMG id=u9 src="resources/images/transparent.gif" class="u9">

<DIV id=u11_text class="u11_text">
    <DIV id=u11_rtf><p style="text-align:center;"><span
            style="font-family:微软雅黑;font-size:13px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;">鉴伪</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u11 src="resources/images/transparent.gif" class="u11">

<DIV id=u12_container class="u12_container">
    <DIV id="u12_img" class="u12_original"></DIV>
    <DIV id=u13 class="u13">
        <DIV id=u13_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<INPUT type="image" id=u12 src="resources/images/transparent.gif" class="u12">

<DIV id=u14_container class="u14_container">
    <DIV id="u14_img" class="u14_original"></DIV>
    <DIV id=u15 class="u15">
        <DIV id=u15_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<INPUT type="image" id=u14 src="resources/images/transparent.gif" class="u14">

<DIV id=u16_container class="u16_container">
    <DIV id="u16_img" class="u16_original"></DIV>
    <DIV id=u17 class="u17">
        <DIV id=u17_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<INPUT type="image" id=u16 src="resources/images/transparent.gif" class="u16">

<DIV id=u18_container class="u18_container">
    <DIV id="u18_img" class="u18_original"></DIV>
    <DIV id=u19 class="u19">
        <DIV id=u19_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<INPUT type="image" id=u18 src="resources/images/transparent.gif" class="u18">

<DIV id=u20_container class="u20_container">
    <DIV id="u20_img" class="u20_original"></DIV>
    <DIV id=u21 class="u21">
        <DIV id=u21_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<INPUT type="image" id=u20 src="resources/images/transparent.gif" class="u20">

<DIV id=u22_container class="u22_container">
    <DIV id="u22_img" class="u22_original"></DIV>
    <DIV id=u23 class="u23">
        <DIV id=u23_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<IMG id=u22 src="resources/images/transparent.gif" class="u22">

<DIV id=u24_container class="u24_container">
    <DIV id="u24_img">
        <IMG src="identify_files/u24_original.jpg" class="raw_image"></DIV>
    <DIV id=u25 class="u25">
        <DIV id=u25_rtf>&nbsp;</DIV>
    </DIV>
</DIV>
<IMG id=u24 src="resources/images/transparent.gif" class="u24">

<DIV id=u26 class="u26">
    <DIV id=u26_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:20px;font-weight:bold;font-style:normal;text-decoration:none;color:#333333;"><%=record.getName()%></span>
    </p></DIV>
</DIV>
<DIV id=u27 class="u27">
    <DIV id=u27_rtf><p style="text-align:right;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">第 </span><span
            style="font-family:Arial Black;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;"><%=record.getNum()+1%>&nbsp; </span><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">次鉴伪</span>
    </p></DIV>
</DIV>
<DIV id=u28 class="u28">
    <DIV id=u28_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">焦油量：11mg</span>
    </p></DIV>
</DIV>
<DIV id=u29 class="u29">
    <DIV id=u29_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">烟气烟碱量：1.1mg</span>
    </p></DIV>
</DIV>
<DIV id=u30 class="u30">
    <DIV id=u30_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">烟气一氧化碳量：11mg</span>
    </p></DIV>
</DIV>
<DIV id=u31 class="u31">
    <DIV id=u31_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">卷烟类型：84mm烤烟</span>
    </p></DIV>
</DIV>
<DIV id=u32_container class="u32_container">
    <DIV id="u32_img" class="u32_original"></DIV>
    <DIV id=u33 class="u33">
        <DIV id=u33_rtf><p style="text-align:left;"><span
                style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FF0000;">您查询的卷烟为<%=record.getFactory()%>出品的</span><span
                style="font-family:Arial;font-size:13px;font-weight:bold;font-style:normal;text-decoration:underline;color:#FF0000;"><%=record.getName()%> </span><span
                style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#FF0000;">品牌。</span>
        </p></DIV>
    </DIV>
</DIV>
<IMG id=u32 src="resources/images/transparent.gif" class="u32">

<DIV id=u34 class="u34">
    <DIV id=u34_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;"><%=record.getName()%></span>
    </p></DIV>
</DIV>
<DIV id=u35 class="u35">
    <DIV id=u35_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">生产日期：<%=record.getDate()%></span>
    </p></DIV>
</DIV>
<DIV id=u36 class="u36">
    <DIV id=u36_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">销售地区：广西 柳州</span>
    </p></DIV>
</DIV>
<DIV id=u37_text class="u37_text">
    <DIV id=u37_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:underline;color:#0000FF;">更多介绍&gt;&gt;</span>
    </p></DIV>
</DIV>
<INPUT type="image" id=u37 src="resources/images/transparent.gif" class="u37">

<DIV id=u38 class="u38">
    <DIV id=u38_rtf><p style="text-align:right;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:italic;text-decoration:none;color:#333333;">数据来源于中国烟草鉴伪数据中心</span>
    </p></DIV>
</DIV>
<DIV id=u39_line class="u39_line"></DIV>

<IMG id=u39 src="resources/images/transparent.gif" class="u39">

<DIV id=u40 class="u40">
    <DIV id=u40_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:underline;color:#0000FF;">卷烟真假鉴别的一些简易方法</span>
    </p></DIV>
</DIV>
<DIV id=u41 class="u41">
    <DIV id=u41_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:underline;color:#0000FF;">真假卷烟识别小技巧</span>
    </p></DIV>
</DIV>
<DIV id=u42 class="u42">
    <DIV id=u42_rtf><p style="text-align:left;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:underline;color:#0000FF;">卷烟真假可鉴定</span>
    </p></DIV>
</DIV>
<DIV id=u43 class="u43">
    <DIV id=u43_rtf><p style="text-align:right;"><span
            style="font-family:Arial;font-size:13px;font-weight:normal;font-style:normal;text-decoration:none;color:#333333;">BEN</span>
    </p></DIV>
</DIV>
</DIV>
<DIV class=preload>
    <img src="AllBack_files/u0_original.png" width="1" height="1"/>
    <img src="AllBack_files/u2_original.png" width="1" height="1"/>
    <img src="identify_files/u9_original.png" width="1" height="1"/>
    <img src="identify_files/u12_original.png" width="1" height="1"/>
    <img src="identify_files/u14_original.png" width="1" height="1"/>
    <img src="identify_files/u16_original.png" width="1" height="1"/>
    <img src="identify_files/u18_original.png" width="1" height="1"/>
    <img src="identify_files/u20_original.png" width="1" height="1"/>
    <img src="identify_files/u22_original.png" width="1" height="1"/>
    <img src="identify_files/u24_original.jpg" width="1" height="1"/>
    <img src="identify_files/u32_original.png" width="1" height="1"/>
    <img src="identify_files/u39_line.png" width="1" height="1"/></DIV>
</BODY>
<SCRIPT src="resources/scripts/axurerp_pagescript.js"></SCRIPT>
<SCRIPT src="identify_files/axurerp_pagespecificscript.js" charset="utf-8"></SCRIPT>
</body>
</html>
