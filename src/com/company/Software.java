package com.company;

    public class Software extends Product {

        private String programmer;
        private String platform; // linux, mac, or pc
        private String os;


        public String getProgrammer(){
            return this.programmer;
        }
        public void setProgrammer(String programmer){
            this.programmer=programmer;
        }
        public String getPlatform(){
            return this.platform;
        }
        public void setPlatform(String platform){
            this.platform=platform;
        }
        public String getOs(){
            return this.os;
        }
        public void setOs(String os){
            this.os = os;
        }
    }

