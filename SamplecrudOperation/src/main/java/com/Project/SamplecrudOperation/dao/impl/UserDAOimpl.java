package com.Project.SamplecrudOperation.dao.impl;

import com.Project.SamplecrudOperation.DTO.CustomerDTO;
import com.Project.SamplecrudOperation.config.ConnectionFactory;
import com.Project.SamplecrudOperation.dao.UserDAO;
import com.Project.SamplecrudOperation.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAOimpl  implements UserDAO {



    @Autowired
    private ConnectionFactory connectionFactory;


    @Override
    public CustomerDTO addCustomer(CustomerDTO customerSaveDTO) {
        Connection connection = null;
        PreparedStatement stmt = null;
        String resultMsg = "";
        int resultSet = 0;
        try {
            connection = connectionFactory.getConnection();

            if (connection != null) {
                int index=1;
                stmt = connection.prepareStatement("Insert into STUDENT_TEST (NAME,ADDRESS,MOBILE_NO) values (?,?,?)");
                stmt.setString(index++, customerSaveDTO.getName());
                stmt.setString(index++,customerSaveDTO.getAddress());
                stmt.setString(index,customerSaveDTO.getMobileNo());
                resultSet = stmt.executeUpdate();
                if(resultSet == 1){
                    resultMsg = "Date Saved";
                }else {
                    resultMsg = "failed";
                }
            }
            else{
                resultMsg = "failed";
            }
        }
        catch (Exception e) {
            resultMsg = "failed";
        } finally {
            connectionFactory.closeConnection(connection, stmt);
        }
        customerSaveDTO.setMessage(resultMsg);
        return customerSaveDTO;
    }

    @Override
    public Object getCustomer(String name) {
        Connection connection = null;
        PreparedStatement stmt = null;
        String resultMsg = "";
        List<CustomerDTO> list = null;
        ResultSet resultSet = null;
        try {
            connection = connectionFactory.getConnection();

            if (connection != null) {
                int index=1;
                stmt = connection.prepareStatement("SELECT NAME,ADDRESS,MOBILE_NO FROM STUDENT_TEST WHERE NAME = ?");
                stmt.setString(index, name);
                resultSet = stmt.executeQuery();
                if (resultSet != null) {
                    list = new ArrayList<>();
                    while (resultSet.next()) {
                        CustomerDTO item = new CustomerDTO();
                        item.setName(resultSet.getString("NAME"));
                        item.setAddress(resultSet.getString("ADDRESS"));
                        item.setMobileNo(resultSet.getString("MOBILE_NO"));
                        list.add(item);
                    }

                }else{
                    System.out.println("hi empty");
                }
            }
            else{
                System.out.println("mano");
            }
        }
        catch (Exception e) {
            System.out.println("empty");
        } finally {
            connectionFactory.closeConnection(connection, stmt);
        }
        return list;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerSaveDTO) {
        Connection connection = null;
        PreparedStatement stmt = null;
        String resultMsg = "";
        int resultSet = 0;
        try {
            connection = connectionFactory.getConnection();

            if (connection != null) {
                int index=1;
                stmt = connection.prepareStatement("UPDATE STUDENT_TEST\n" +
                        "SET ADDRESS=?, MOBILE_NO=? \n" +
                        "WHERE NAME=?");

                stmt.setString(index++, customerSaveDTO.getAddress());
                stmt.setString(index++, customerSaveDTO.getMobileNo());
                stmt.setString(index, customerSaveDTO.getName());


                resultSet = stmt.executeUpdate();
                if(resultSet > 0){
                    customerSaveDTO.setMessage(CommonConstants.SUCCESS_CONST);
                }else {
                    customerSaveDTO.setMessage("failed");
                }

            }
            else{
                System.out.println("fail");
            }
        }
        catch (Exception e) {

        } finally {
            connectionFactory.closeConnection(connection, stmt);
        }
        return   customerSaveDTO;
    }
    @Override
    public CustomerDTO deleteCustomer(CustomerDTO customerSaveDTO) {
        Connection connection = null;
        PreparedStatement stmt = null;
        String resultMsg = "";
        int resultSet = 0;
        try {
            connection = connectionFactory.getConnection();

            if (connection != null) {
                int index=1;
                stmt = connection.prepareStatement("DELETE FROM STUDENT_TEST  \n" +
                        "WHERE NAME = ? ");

                stmt.setString(index, customerSaveDTO.getName());

                resultSet = stmt.executeUpdate();
                if(resultSet > 0){
                    customerSaveDTO.setMessage(CommonConstants.SUCCESS_CONST);
                }else {
                    customerSaveDTO.setMessage("failed");
                }

            }
            else{
                System.out.println("fail");
            }
        }
        catch (Exception e) {

        } finally {
            connectionFactory.closeConnection(connection, stmt);
        }
        return   customerSaveDTO;
    }

}



