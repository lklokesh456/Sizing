package com.enterprise.SizingPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Document me!
 *
 * @author shaik.mohammedyasin
 *
 */

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transact {
    @Id
    private String Id;
    
    @Column(name="form_id", length=8, nullable=true, unique=false)
    private Long formId;
    
    @Column(name="stackid", length=510, nullable=true, unique=false)
    private String stackId;
    
    @Column(name="databaseid", length=510, nullable=true, unique=false)
    private String databaseId;
    
    @Column(name="businessHours", length=255, nullable=true, unique=false)
    private String businessHours;
    
    @Column(name="year", length=100, nullable=true, unique=false)
    private String years;
    
    @Column(name="cobhrs", length=100, nullable=true, unique=false)
    private String cobhrs;
    
    @Column(name="cobmins", length=100, nullable=true, unique=false)
    private String cobmins;
    
    @Column(name="currenttotalcustomers", length=100, nullable=true, unique=false)
    private String currentTotalCustomers;
    
    @Column(name="currenttotalaccounts", length=100, nullable=true, unique=false)
    private String currentTotalAccounts;
    
    @Column(name="currentconcurrentusers", length=100, nullable=true, unique=false)
    private String currentConcurrentUsers;
    
    @Column(name="currentbankusers", length=100, nullable=true, unique=false)
    private String currentBankUsers;
    
    @Column(name="currentaveragetransactionperday", length=100, nullable=true, unique=false)
    private String currentAverageTransactionperday;
    
    @Column(name="currentpeakVolume", length=100, nullable=true, unique=false)
    private String currentPeakVolume;
    
    @Column(name="target_totalcustomers", length=100, nullable=true, unique=false)
    private String targetTotalCustomers;
    
    @Column(name="target_totalaccounts", length=100, nullable=true, unique=false)
    private String targetTotalAccounts;
    
    @Column(name="target_concurrentusers", length=100, nullable=true, unique=false)
    private String targetConcurrentUsers;
    
    @Column(name="target_bankusers", length=100, nullable=true, unique=false)
    private String targetBankUsers;
    
    @Column(name="target_averagetransactionperday", length=100, nullable=true, unique=false)
    private String targetAverageTransactionperday;
    
    @Column(name="target_peakvolume", length=100, nullable=true, unique=false)
    private String targetPeakVolume;

    /**
     * @return the id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        Id = id;
    }

    /**
     * @return the formId
     */
    public Long getFormId() {
        return formId;
    }

    /**
     * @param formId the formId to set
     */
    public void setFormId(Long formId) {
        this.formId = formId;
    }

    /**
     * @return the stackId
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * @param stackId the stackId to set
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * @return the databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * @param databaseId the databaseId to set
     */
    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * @return the businessHours
     */
    public String getBusinessHours() {
        return businessHours;
    }

    /**
     * @param businessHours the businessHours to set
     */
    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    /**
     * @return the years
     */
    public String getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(String years) {
        this.years = years;
    }

    /**
     * @return the cobhrs
     */
    public String getCobhrs() {
        return cobhrs;
    }

    /**
     * @param cobhrs the cobhrs to set
     */
    public void setCobhrs(String cobhrs) {
        this.cobhrs = cobhrs;
    }

    /**
     * @return the cobmins
     */
    public String getCobmins() {
        return cobmins;
    }

    /**
     * @param cobmins the cobmins to set
     */
    public void setCobmins(String cobmins) {
        this.cobmins = cobmins;
    }

    /**
     * @return the currentTotalCustomers
     */
    public String getCurrentTotalCustomers() {
        return currentTotalCustomers;
    }

    /**
     * @param currentTotalCustomers the currentTotalCustomers to set
     */
    public void setCurrentTotalCustomers(String currentTotalCustomers) {
        this.currentTotalCustomers = currentTotalCustomers;
    }

    /**
     * @return the currentTotalAccounts
     */
    public String getCurrentTotalAccounts() {
        return currentTotalAccounts;
    }

    /**
     * @param currentTotalAccounts the currentTotalAccounts to set
     */
    public void setCurrentTotalAccounts(String currentTotalAccounts) {
        this.currentTotalAccounts = currentTotalAccounts;
    }

    /**
     * @return the currentConcurrentUsers
     */
    public String getCurrentConcurrentUsers() {
        return currentConcurrentUsers;
    }

    /**
     * @param currentConcurrentUsers the currentConcurrentUsers to set
     */
    public void setCurrentConcurrentUsers(String currentConcurrentUsers) {
        this.currentConcurrentUsers = currentConcurrentUsers;
    }

    /**
     * @return the currentBankUsers
     */
    public String getCurrentBankUsers() {
        return currentBankUsers;
    }

    /**
     * @param currentBankUsers the currentBankUsers to set
     */
    public void setCurrentBankUsers(String currentBankUsers) {
        this.currentBankUsers = currentBankUsers;
    }

    /**
     * @return the currentAverageTransactionperday
     */
    public String getCurrentAverageTransactionperday() {
        return currentAverageTransactionperday;
    }

    /**
     * @param currentAverageTransactionperday the currentAverageTransactionperday to set
     */
    public void setCurrentAverageTransactionperday(String currentAverageTransactionperday) {
        this.currentAverageTransactionperday = currentAverageTransactionperday;
    }

    /**
     * @return the currentPeakVolume
     */
    public String getCurrentPeakVolume() {
        return currentPeakVolume;
    }

    /**
     * @param currentPeakVolume the currentPeakVolume to set
     */
    public void setCurrentPeakVolume(String currentPeakVolume) {
        this.currentPeakVolume = currentPeakVolume;
    }

    /**
     * @return the targetTotalCustomers
     */
    public String getTargetTotalCustomers() {
        return targetTotalCustomers;
    }

    /**
     * @param targetTotalCustomers the targetTotalCustomers to set
     */
    public void setTargetTotalCustomers(String targetTotalCustomers) {
        this.targetTotalCustomers = targetTotalCustomers;
    }

    /**
     * @return the targetTotalAccounts
     */
    public String getTargetTotalAccounts() {
        return targetTotalAccounts;
    }

    /**
     * @param targetTotalAccounts the targetTotalAccounts to set
     */
    public void setTargetTotalAccounts(String targetTotalAccounts) {
        this.targetTotalAccounts = targetTotalAccounts;
    }

    /**
     * @return the targetConcurrentUsers
     */
    public String getTargetConcurrentUsers() {
        return targetConcurrentUsers;
    }

    /**
     * @param targetConcurrentUsers the targetConcurrentUsers to set
     */
    public void setTargetConcurrentUsers(String targetConcurrentUsers) {
        this.targetConcurrentUsers = targetConcurrentUsers;
    }

    /**
     * @return the targetBankUsers
     */
    public String getTargetBankUsers() {
        return targetBankUsers;
    }

    /**
     * @param targetBankUsers the targetBankUsers to set
     */
    public void setTargetBankUsers(String targetBankUsers) {
        this.targetBankUsers = targetBankUsers;
    }

    /**
     * @return the targetAverageTransactionperday
     */
    public String getTargetAverageTransactionperday() {
        return targetAverageTransactionperday;
    }

    /**
     * @param targetAverageTransactionperday the targetAverageTransactionperday to set
     */
    public void setTargetAverageTransactionperday(String targetAverageTransactionperday) {
        this.targetAverageTransactionperday = targetAverageTransactionperday;
    }

    /**
     * @return the targetPeakVolume
     */
    public String getTargetPeakVolume() {
        return targetPeakVolume;
    }

    /**
     * @param targetPeakVolume the targetPeakVolume to set
     */
    public void setTargetPeakVolume(String targetPeakVolume) {
        this.targetPeakVolume = targetPeakVolume;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Transact [Id=");
        builder.append(Id);
        builder.append(", formId=");
        builder.append(formId);
        builder.append(", stackId=");
        builder.append(stackId);
        builder.append(", databaseId=");
        builder.append(databaseId);
        builder.append(", businessHours=");
        builder.append(businessHours);
        builder.append(", years=");
        builder.append(years);
        builder.append(", cobhrs=");
        builder.append(cobhrs);
        builder.append(", cobmins=");
        builder.append(cobmins);
        builder.append(", currentTotalCustomers=");
        builder.append(currentTotalCustomers);
        builder.append(", currentTotalAccounts=");
        builder.append(currentTotalAccounts);
        builder.append(", currentConcurrentUsers=");
        builder.append(currentConcurrentUsers);
        builder.append(", currentBankUsers=");
        builder.append(currentBankUsers);
        builder.append(", currentAverageTransactionperday=");
        builder.append(currentAverageTransactionperday);
        builder.append(", currentPeakVolume=");
        builder.append(currentPeakVolume);
        builder.append(", targetTotalCustomers=");
        builder.append(targetTotalCustomers);
        builder.append(", targetTotalAccounts=");
        builder.append(targetTotalAccounts);
        builder.append(", targetConcurrentUsers=");
        builder.append(targetConcurrentUsers);
        builder.append(", targetBankUsers=");
        builder.append(targetBankUsers);
        builder.append(", targetAverageTransactionperday=");
        builder.append(targetAverageTransactionperday);
        builder.append(", targetPeakVolume=");
        builder.append(targetPeakVolume);
        builder.append("]");
        return builder.toString();
    }

    
}
