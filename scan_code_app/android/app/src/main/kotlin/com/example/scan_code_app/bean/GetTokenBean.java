package com.example.scan_code_app.bean;

public class GetTokenBean {

    /**
     * code : 0
     * message : {"zh_TW":"成功","en_US":"Successful","zh_CN":"成功"}
     * data : {"companyCode":"axbsec","refreshTokenExpiresAt":1681873554452,"sessionTokenExpiresAt":1681787154452,"sessionToken":"eyJ0eXBlIjoiYWNjZXNzIiwiYWxnIjoiSFM1MTIifQ.eyJleHAiOjE2ODE3ODcxNTQsImp0aSI6IjNiMzEwNTZhOTJlNjQxMGRhNDk4MTUxZTY2ZTI0YmI3In0.u86XELW7zAFMOhhKu0GpBNAJhkTrUpE10t32tCqAx1_KzB-4JWp_-ZTApf7ozyxOmOSKe_luRPxKQV0toAJO0A","tokenType":"Bearer","refreshToken":"eyJ0eXBlIjoicmVmcmVzaCIsImFsZyI6IkhTNTEyIn0.eyJleHAiOjE2ODE4NzM1NTQsImp0aSI6IjNiMzEwNTZhOTJlNjQxMGRhNDk4MTUxZTY2ZTI0YmI3In0.qdG0r2yjH511nJI0VsUsHet_pHYodT6tDW74NBNOgyiydBhqnuiZKIoi2N-u9ImaH-hf1j7mlXZsEVRtjr5bow"}
     */

    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }



    public static class DataBean {
        /**
         * companyCode : axbsec
         * refreshTokenExpiresAt : 1681873554452
         * sessionTokenExpiresAt : 1681787154452
         * sessionToken : eyJ0eXBlIjoiYWNjZXNzIiwiYWxnIjoiSFM1MTIifQ.eyJleHAiOjE2ODE3ODcxNTQsImp0aSI6IjNiMzEwNTZhOTJlNjQxMGRhNDk4MTUxZTY2ZTI0YmI3In0.u86XELW7zAFMOhhKu0GpBNAJhkTrUpE10t32tCqAx1_KzB-4JWp_-ZTApf7ozyxOmOSKe_luRPxKQV0toAJO0A
         * tokenType : Bearer
         * refreshToken : eyJ0eXBlIjoicmVmcmVzaCIsImFsZyI6IkhTNTEyIn0.eyJleHAiOjE2ODE4NzM1NTQsImp0aSI6IjNiMzEwNTZhOTJlNjQxMGRhNDk4MTUxZTY2ZTI0YmI3In0.qdG0r2yjH511nJI0VsUsHet_pHYodT6tDW74NBNOgyiydBhqnuiZKIoi2N-u9ImaH-hf1j7mlXZsEVRtjr5bow
         */

        private String companyCode;
        private long refreshTokenExpiresAt;
        private long sessionTokenExpiresAt;
        private String sessionToken;
        private String tokenType;
        private String refreshToken;

        public String getCompanyCode() {
            return companyCode;
        }

        public void setCompanyCode(String companyCode) {
            this.companyCode = companyCode;
        }

        public long getRefreshTokenExpiresAt() {
            return refreshTokenExpiresAt;
        }

        public void setRefreshTokenExpiresAt(long refreshTokenExpiresAt) {
            this.refreshTokenExpiresAt = refreshTokenExpiresAt;
        }

        public long getSessionTokenExpiresAt() {
            return sessionTokenExpiresAt;
        }

        public void setSessionTokenExpiresAt(long sessionTokenExpiresAt) {
            this.sessionTokenExpiresAt = sessionTokenExpiresAt;
        }

        public String getSessionToken() {
            return sessionToken;
        }

        public void setSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
        }

        public String getTokenType() {
            return tokenType;
        }

        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }

        public String getRefreshToken() {
            return refreshToken;
        }

        public void setRefreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
        }
    }
}
