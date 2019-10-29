/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;
//
//import com.dao.ProductDao;
//import com.model.Admin;
//import com.model.Doctor;
//import java.util.ArrayList;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author PC
 */
@ManagedBean(name="com")
@SessionScoped
public class AdminInfo {
//    List<Admin>adminList = new ArrayList<>();
//    List<Doctor>doctorList = new ArrayList<>();
    int id;
    String doctorName;
    String userName;
    String password;
    String email;
    String search;
    String location;
    String selectGender;
    String emailId;
    String catagory;
    String timing;
    int fees;
    String phone;
    String info;
    String experiance;
    String patient;
    String feedback;
    String patientName;
    String dateOfBirth;
    String address;
    String report;
    String timings;
    String book;
    String approve;
    String reason;
    String send;
    String doctor;
    String status; 

//    @PostConstruct
//    public void inti() {
//        adminList = dao.getAllAdm();
//        System.out.println("---- size "+adminList.size());
//        doctorList = dao.getAllAdm1();
//        System.out.println("---- size "+doctorList.size());
//    }
//    public List<String> testCompleteMethod(String input) {
//        System.out.println("------ "+input);
//       List<String> suggesstions = new ArrayList<>();
////        for(Admin a: adminList) {
////            if(!a.getUserName().isEmpty() && a.getUserName().toLowerCase().contains(input.toLowerCase())) {
////                suggesstions.add(a.getId()+"-"+a.getUserName());
////            }
////        }
//        return suggesstions;
//  
//    }
    
//     public String logIn(){
//     
//    boolean response = dao.login(userName,password);
//    System.out.println("Response login -------"+response);
//    if(response ==true){
//    return "adminHome";
//    }
//    return "adminRegister";
//    }
//    ProductDao dao = new ProductDao();
//     public String register(){
//       Admin a = new Admin();
//       a.setUserName(userName);
//       a.setEmailId(email);
//       a.setPassword(password);
//       dao.signUp(a);
//       return "adminLogin";
//   }
//      public List<String> testCompleteMethod1(String input) {
//        System.out.println("------ "+input);
//        List<String> suggesstions = new ArrayList<>();
//        for(Doctor d: doctorList) {
//            if(!d.getDoctorName().isEmpty() && d.getDoctorName().toLowerCase().contains(input.toLowerCase())) {
//                suggesstions.add(d.getId()+"-"+d.getDoctorName());
//            }
//        }
//        return suggesstions;
//    }
//    
//     public String logIn1(){
//     
//    boolean response = dao.login1(doctorName, password);
//    if(response == true){
//    return "search_view";
//    }
//    return "register_doctor";
//    }
//    
//     public String register1(){
//       Doctor d = new Doctor();
//       d.setDoctorName(doctorName);
//       d.setPassword(password);
//       d.setLocation(location);
//       d.setSelectGender(selectGender);
//       d.setEmailId(emailId);
//       d.setCatagory(catagory);
//       d.setTiming(timing);
//       d.setFees(fees);
//       d.setPhone(phone);
//       d.setInfo(info);
//       d.setExperiance(experiance);
//       dao.signUp1(d);
//       return "doctorLogin";
//       
//       
//   }
    public AdminInfo() {
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSelectGender() {
        return selectGender;
    }

    public void setSelectGender(String selectGender) {
        this.selectGender = selectGender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

//    public ProductDao getDao() {
//        return dao;
//    }
//
//    public void setDao(ProductDao dao) {
//        this.dao = dao;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

   
    
   
    
    
//    public String addProductUrl() {
//        return "addProduct";
//    }
//    public String addProduct() {
//        dao.insert(new Admin(userName,email,password));
//        return "index";
//    }
//    public String back() {
//        return "index";
//    }

   
    
}
