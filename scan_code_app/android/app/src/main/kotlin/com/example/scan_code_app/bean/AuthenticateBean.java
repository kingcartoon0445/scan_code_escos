package com.example.scan_code_app.bean;

public class AuthenticateBean {

    private String uaid;
    private String realUserIPAddress;
    private ChallengeResponseBean challengeResponse;
    private LocationBean location;
    private DeviceBean device;
    private ApplicationBean application;
    private OptionsBean options;
    private ParamsBean params;
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getUaid() {
        return uaid;
    }

    public void setUaid(String uaid) {
        this.uaid = uaid;
    }

    public String getRealUserIPAddress() {
        return realUserIPAddress;
    }

    public void setRealUserIPAddress(String realUserIPAddress) {
        this.realUserIPAddress = realUserIPAddress;
    }

    public ChallengeResponseBean getChallengeResponse() {
        return challengeResponse;
    }

    public void setChallengeResponse(ChallengeResponseBean challengeResponse) {
        this.challengeResponse = challengeResponse;
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public DeviceBean getDevice() {
        return device;
    }

    public void setDevice(DeviceBean device) {
        this.device = device;
    }

    public ApplicationBean getApplication() {
        return application;
    }

    public void setApplication(ApplicationBean application) {
        this.application = application;
    }

    public OptionsBean getOptions() {
        return options;
    }

    public void setOptions(OptionsBean options) {
        this.options = options;
    }

    public ParamsBean getParams() {
        return params;
    }

    public void setParams(ParamsBean params) {
        this.params = params;
    }

    public static class ChallengeResponseBean {
        private String authenticationId;
        private String challengeCode;
        private String response;

        public String getAuthenticationId() {
            return authenticationId;
        }

        public void setAuthenticationId(String authenticationId) {
            this.authenticationId = authenticationId;
        }

        public String getChallengeCode() {
            return challengeCode;
        }

        public void setChallengeCode(String challengeCode) {
            this.challengeCode = challengeCode;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }
    }

    public static class LocationBean {
        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }

    public static class DeviceBean {
        private String brand;
        private String model;
        private String os;
        private String osVersion;
        private String udid;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getOsVersion() {
            return osVersion;
        }

        public void setOsVersion(String osVersion) {
            this.osVersion = osVersion;
        }

        public String getUdid() {
            return udid;
        }

        public void setUdid(String udid) {
            this.udid = udid;
        }
    }

    public static class ApplicationBean {
        private String type;
        private String appName;
        private String version;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }

    public static class OptionsBean {
        private String responseTemplate;

        public String getResponseTemplate() {
            return responseTemplate;
        }

        public void setResponseTemplate(String responseTemplate) {
            this.responseTemplate = responseTemplate;
        }
    }

    public static class ParamsBean {
        private ArcodeBean arcode;

        public ArcodeBean getArcode() {
            return arcode;
        }

        public void setArcode(ArcodeBean arcode) {
            this.arcode = arcode;
        }

        public static class ArcodeBean {
            private int authenticatedResult;
            private String arsdkExtendedInfo;

            public int getAuthenticatedResult() {
                return authenticatedResult;
            }

            public void setAuthenticatedResult(int authenticatedResult) {
                this.authenticatedResult = authenticatedResult;
            }


            public String getArsdkExtendedInfo() {
                return arsdkExtendedInfo;
            }

            public void setArsdkExtendedInfo(String arsdkExtendedInfo) {
                this.arsdkExtendedInfo = arsdkExtendedInfo;
            }
        }
    }
}
