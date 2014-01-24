package com.iotsec.tobacco.javabean;
// Generated 2014-1-22 11:30:49 by Hibernate Tools 3.2.2.GA



/**
 * 			Represents a single record.
 * 			@author QinghaoLiu
 * 		
 */
public class Record  implements java.io.Serializable {


     private long id;
     private String PID;
     private String Name;
     private String Factory;
     private String Date;
     private String Batch;
     private String CryptoFlag;
     private String Code;
     private long Num;

    public Record() {
    }

	
    public Record(String PID, String Name, String Factory, String Date, String Batch, String CryptoFlag) {
        this.PID = PID;
        this.Name = Name;
        this.Factory = Factory;
        this.Date = Date;
        this.Batch = Batch;
        this.CryptoFlag = CryptoFlag;
    }
    public Record(String PID, String Name, String Factory, String Date, String Batch, String CryptoFlag, String Code, long Num) {
       this.PID = PID;
       this.Name = Name;
       this.Factory = Factory;
       this.Date = Date;
       this.Batch = Batch;
       this.CryptoFlag = CryptoFlag;
       this.Code = Code;
       this.Num = Num;
    }
   
    public long getId() {
        return this.id;
    }
    
    private void setId(long id) {
        this.id = id;
    }
    public String getPID() {
        return this.PID;
    }
    
    public void setPID(String PID) {
        this.PID = PID;
    }
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getFactory() {
        return this.Factory;
    }
    
    public void setFactory(String Factory) {
        this.Factory = Factory;
    }
    public String getDate() {
        return this.Date;
    }
    
    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getBatch() {
        return this.Batch;
    }
    
    public void setBatch(String Batch) {
        this.Batch = Batch;
    }
    public String getCryptoFlag() {
        return this.CryptoFlag;
    }
    
    public void setCryptoFlag(String CryptoFlag) {
        this.CryptoFlag = CryptoFlag;
    }
    public String getCode() {
        return this.Code;
    }
    
    public void setCode(String Code) {
        this.Code = Code;
    }
    public long getNum() {
        return this.Num;
    }
    
    public void setNum(long Num) {
        this.Num = Num;
    }

    /**
     * toString
     * @return String
     */
     public String toString() {
	  StringBuffer buffer = new StringBuffer();

      buffer.append(getClass().getName()).append("@").append(Integer.toHexString(hashCode())).append(" [");
      buffer.append("PID").append("='").append(getPID()).append("' ");			
      buffer.append("Name").append("='").append(getName()).append("' ");			
      buffer.append("Factory").append("='").append(getFactory()).append("' ");			
      buffer.append("Date").append("='").append(getDate()).append("' ");			
      buffer.append("Batch").append("='").append(getBatch()).append("' ");			
      buffer.append("CryptoFlag").append("='").append(getCryptoFlag()).append("' ");			
      buffer.append("Code").append("='").append(getCode()).append("' ");			
      buffer.append("Num").append("='").append(getNum()).append("' ");			
      buffer.append("]");
      
      return buffer.toString();
     }



}


