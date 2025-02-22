package com.sraynitjsr;

import  com.sraynitjsr._1_datatypes.*;
import  com.sraynitjsr._2_variables.*;
import  com.sraynitjsr._3_userdefineddatatypes.*;
import  com.sraynitjsr._4_controlstatements.*;
import  com.sraynitjsr._5_loops.*;
import  com.sraynitjsr._6_array.*;
import  com.sraynitjsr._7_strings.*;
import  com.sraynitjsr._8_inputoutput.*;
import  com.sraynitjsr._9_classinterface.*;
import  com.sraynitjsr._10_oops.MyOOPS;
import  com.sraynitjsr._11_keywords.MyKeywords;
import  com.sraynitjsr._12_exceptions.MyExceptionHandling;
import  com.sraynitjsr._13_multithreading.MyMultithreading;
import  com.sraynitjsr._14_collections.*;
import  com.sraynitjsr._15_streams.*;
import com.sraynitjsr._16_designpatterns.MyDesignPatterns;

import  org.springframework.boot.SpringApplication;
import  org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
        callRespectiveModules();
    }
    public static void callRespectiveModules() {
        MyVariables.start();
        MyDataTypes.start();
        MyUserDefinedDataTypes.start();
        MyControlStatements.start();
        MyLoops.start();
        MyArrays.start();
        MyStrings.start();
        MyInputOutput.start();
        MyClassInterface.start();
        MyOOPS.start();
        MyKeywords.start();
        MyExceptionHandling.start();
        MyMultithreading.start();
        MyCollections.start();
        MyStreamAPI.start();
        MyDesignPatterns.start();
    }
}
