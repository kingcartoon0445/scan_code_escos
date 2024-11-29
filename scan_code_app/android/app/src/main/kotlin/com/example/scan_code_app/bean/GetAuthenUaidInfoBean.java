package com.example.scan_code_app.bean;

import java.util.List;

public class GetAuthenUaidInfoBean {

    /**
     * code : string
     * message : {"en_US":"Successful","zh_CN":"成功","zh_TW":"成功"}
     * data : {"authenticationId":"string","uaid":{"companyCode":"string","uaid":"string","thirdPartyCode":"string","status":0,"labelTypeCode":"string","layerNumberInSpecs":0,"authenticated":true,"expiresAt":0,"uaidBatch":{"batchNumber":0,"seqNumber":0},"currentOwner":{"username":"string","displayName":"string","avatarImagePath":"string","effectiveAt":0,"blockchainTransactionId":"string"},"specs":{"type":0,"layers":[{"layerNumber":0,"type":0,"format":0,"subFormat":"string"}]},"isVerify":true,"arCodeType":"string"},"challenge":{"challengeCode":"string","format":"string"},"productBatch":{"productNumber":"string","productName":null,"productCategoryCode":"string","productBatchNumber":"string","blockchainTransactionId":"string","attributes":[{"code":"string","name":"string","value":"string","sequence":0,"valueType":0,"fieldType":0,"displayFormat":"string","displayFlag":true}],"images":[{"code":"string","imagePath":"string","sequence":0,"displayFlag":true}],"rawMaterials":[{"code":"string","name":"string","batchNumber":"string","quantity":0,"measurementUnit":"string"}]},"scanData":{"totalScanCount":0,"firstScanAt":0,"firstScanByUsername":"string","firstScanByDisplayName":"string","lastScanAt":0,"lastScanByUsername":"string","lastScanByDisplayName":"string","verifyAt":0,"verifyByUsername":"string","verifyByDisplayName":"string"},"authenticationMessage":{"code":"string","message":"string"},"authMessageExt":{"verifyAxRStatus":0,"verifyStatus":0,"axrImgVerifyErrorCode":"string"},"pointMsg":{"earnedPoint":"string","balancePoint":"string","expirationDate":null},"ownershipData":{"scantime":0,"signature":"string","type":"string","euaid":"string","huaid":"string"},"hiddenProductInfo":[{"order":1,"euaid":"ABCDEF123456","huaid":"GHIJKLMN7890","message":{"en_US":"Use SALES10 for 10% discount","zh_CN":"使用 SALES10 可享受 10% 的折扣","zh_TW":"使用 SALES10 可享受 10% 的折扣"},"image":{"en_US":"5db7bd13e4b084a83abe6ea3.png","zh_CN":"5db7bd13e4b084a83abe6ea4.png","zh_TW":"5db7bd13e4b084a83abe6ea5.png"},"imagelink":{"en_US":"https://shop.axr.com/en","zh_CN":"https://shop.axr.com/zhcn","zh_TW":"https://shop.axr.com/zhtw"}}],"recallInfo":[{"id":"string","status":null,"subject":"string","content":"string","startTime":null,"isEnded":true}]}
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
         * authenticationId : string
         * uaid : {"companyCode":"string","uaid":"string","thirdPartyCode":"string","status":0,"labelTypeCode":"string","layerNumberInSpecs":0,"authenticated":true,"expiresAt":0,"uaidBatch":{"batchNumber":0,"seqNumber":0},"currentOwner":{"username":"string","displayName":"string","avatarImagePath":"string","effectiveAt":0,"blockchainTransactionId":"string"},"specs":{"type":0,"layers":[{"layerNumber":0,"type":0,"format":0,"subFormat":"string"}]},"isVerify":true,"arCodeType":"string"}
         * challenge : {"challengeCode":"string","format":"string"}
         * productBatch : {"productNumber":"string","productName":null,"productCategoryCode":"string","productBatchNumber":"string","blockchainTransactionId":"string","attributes":[{"code":"string","name":"string","value":"string","sequence":0,"valueType":0,"fieldType":0,"displayFormat":"string","displayFlag":true}],"images":[{"code":"string","imagePath":"string","sequence":0,"displayFlag":true}],"rawMaterials":[{"code":"string","name":"string","batchNumber":"string","quantity":0,"measurementUnit":"string"}]}
         * scanData : {"totalScanCount":0,"firstScanAt":0,"firstScanByUsername":"string","firstScanByDisplayName":"string","lastScanAt":0,"lastScanByUsername":"string","lastScanByDisplayName":"string","verifyAt":0,"verifyByUsername":"string","verifyByDisplayName":"string"}
         * authenticationMessage : {"code":"string","message":"string"}
         * authMessageExt : {"verifyAxRStatus":0,"verifyStatus":0,"axrImgVerifyErrorCode":"string"}
         * pointMsg : {"earnedPoint":"string","balancePoint":"string","expirationDate":null}
         * ownershipData : {"scantime":0,"signature":"string","type":"string","euaid":"string","huaid":"string"}
         * hiddenProductInfo : [{"order":1,"euaid":"ABCDEF123456","huaid":"GHIJKLMN7890","message":{"en_US":"Use SALES10 for 10% discount","zh_CN":"使用 SALES10 可享受 10% 的折扣","zh_TW":"使用 SALES10 可享受 10% 的折扣"},"image":{"en_US":"5db7bd13e4b084a83abe6ea3.png","zh_CN":"5db7bd13e4b084a83abe6ea4.png","zh_TW":"5db7bd13e4b084a83abe6ea5.png"},"imagelink":{"en_US":"https://shop.axr.com/en","zh_CN":"https://shop.axr.com/zhcn","zh_TW":"https://shop.axr.com/zhtw"}}]
         * recallInfo : [{"id":"string","status":null,"subject":"string","content":"string","startTime":null,"isEnded":true}]
         */

        private String authenticationId;
        private UaidBean uaid;
        private ChallengeBean challenge;
        private ProductBatchBean productBatch;
        private ScanDataBean scanData;
        private AuthenticationMessageBean authenticationMessage;
        private AuthMessageExtBean authMessageExt;
        private PointMsgBean pointMsg;
        private OwnershipDataBean ownershipData;
        private List<HiddenProductInfoBean> hiddenProductInfo;
        private List<RecallInfoBean> recallInfo;

        public String getAuthenticationId() {
            return authenticationId;
        }

        public void setAuthenticationId(String authenticationId) {
            this.authenticationId = authenticationId;
        }

        public UaidBean getUaid() {
            return uaid;
        }

        public void setUaid(UaidBean uaid) {
            this.uaid = uaid;
        }

        public ChallengeBean getChallenge() {
            return challenge;
        }

        public void setChallenge(ChallengeBean challenge) {
            this.challenge = challenge;
        }

        public ProductBatchBean getProductBatch() {
            return productBatch;
        }

        public void setProductBatch(ProductBatchBean productBatch) {
            this.productBatch = productBatch;
        }

        public ScanDataBean getScanData() {
            return scanData;
        }

        public void setScanData(ScanDataBean scanData) {
            this.scanData = scanData;
        }

        public AuthenticationMessageBean getAuthenticationMessage() {
            return authenticationMessage;
        }

        public void setAuthenticationMessage(AuthenticationMessageBean authenticationMessage) {
            this.authenticationMessage = authenticationMessage;
        }

        public AuthMessageExtBean getAuthMessageExt() {
            return authMessageExt;
        }

        public void setAuthMessageExt(AuthMessageExtBean authMessageExt) {
            this.authMessageExt = authMessageExt;
        }

        public PointMsgBean getPointMsg() {
            return pointMsg;
        }

        public void setPointMsg(PointMsgBean pointMsg) {
            this.pointMsg = pointMsg;
        }

        public OwnershipDataBean getOwnershipData() {
            return ownershipData;
        }

        public void setOwnershipData(OwnershipDataBean ownershipData) {
            this.ownershipData = ownershipData;
        }

        public List<HiddenProductInfoBean> getHiddenProductInfo() {
            return hiddenProductInfo;
        }

        public void setHiddenProductInfo(List<HiddenProductInfoBean> hiddenProductInfo) {
            this.hiddenProductInfo = hiddenProductInfo;
        }

        public List<RecallInfoBean> getRecallInfo() {
            return recallInfo;
        }

        public void setRecallInfo(List<RecallInfoBean> recallInfo) {
            this.recallInfo = recallInfo;
        }

        public static class UaidBean {
            /**
             * companyCode : string
             * uaid : string
             * thirdPartyCode : string
             * status : 0
             * labelTypeCode : string
             * layerNumberInSpecs : 0
             * authenticated : true
             * expiresAt : 0
             * uaidBatch : {"batchNumber":0,"seqNumber":0}
             * currentOwner : {"username":"string","displayName":"string","avatarImagePath":"string","effectiveAt":0,"blockchainTransactionId":"string"}
             * specs : {"type":0,"layers":[{"layerNumber":0,"type":0,"format":0,"subFormat":"string"}]}
             * isVerify : true
             * arCodeType : string
             */

            private String companyCode;
            private String uaid;
            private String thirdPartyCode;
            private int status;
            private String labelTypeCode;
            private int layerNumberInSpecs;
            private boolean authenticated;
            private long expiresAt;
            private UaidBatchBean uaidBatch;
            private CurrentOwnerBean currentOwner;
            private SpecsBean specs;
            private boolean isVerify;
            private String arCodeType;

            public String getCompanyCode() {
                return companyCode;
            }

            public void setCompanyCode(String companyCode) {
                this.companyCode = companyCode;
            }

            public String getUaid() {
                return uaid;
            }

            public void setUaid(String uaid) {
                this.uaid = uaid;
            }

            public String getThirdPartyCode() {
                return thirdPartyCode;
            }

            public void setThirdPartyCode(String thirdPartyCode) {
                this.thirdPartyCode = thirdPartyCode;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getLabelTypeCode() {
                return labelTypeCode;
            }

            public void setLabelTypeCode(String labelTypeCode) {
                this.labelTypeCode = labelTypeCode;
            }

            public int getLayerNumberInSpecs() {
                return layerNumberInSpecs;
            }

            public void setLayerNumberInSpecs(int layerNumberInSpecs) {
                this.layerNumberInSpecs = layerNumberInSpecs;
            }

            public boolean isAuthenticated() {
                return authenticated;
            }

            public void setAuthenticated(boolean authenticated) {
                this.authenticated = authenticated;
            }

            public long getExpiresAt() {
                return expiresAt;
            }

            public void setExpiresAt(long expiresAt) {
                this.expiresAt = expiresAt;
            }

            public UaidBatchBean getUaidBatch() {
                return uaidBatch;
            }

            public void setUaidBatch(UaidBatchBean uaidBatch) {
                this.uaidBatch = uaidBatch;
            }

            public CurrentOwnerBean getCurrentOwner() {
                return currentOwner;
            }

            public void setCurrentOwner(CurrentOwnerBean currentOwner) {
                this.currentOwner = currentOwner;
            }

            public SpecsBean getSpecs() {
                return specs;
            }

            public void setSpecs(SpecsBean specs) {
                this.specs = specs;
            }

            public boolean isIsVerify() {
                return isVerify;
            }

            public void setIsVerify(boolean isVerify) {
                this.isVerify = isVerify;
            }

            public String getArCodeType() {
                return arCodeType;
            }

            public void setArCodeType(String arCodeType) {
                this.arCodeType = arCodeType;
            }

            public static class UaidBatchBean {
                /**
                 * batchNumber : 0
                 * seqNumber : 0
                 */

                private int batchNumber;
                private int seqNumber;

                public int getBatchNumber() {
                    return batchNumber;
                }

                public void setBatchNumber(int batchNumber) {
                    this.batchNumber = batchNumber;
                }

                public int getSeqNumber() {
                    return seqNumber;
                }

                public void setSeqNumber(int seqNumber) {
                    this.seqNumber = seqNumber;
                }
            }

            public static class CurrentOwnerBean {
                /**
                 * username : string
                 * displayName : string
                 * avatarImagePath : string
                 * effectiveAt : 0
                 * blockchainTransactionId : string
                 */

                private String username;
                private String displayName;
                private String avatarImagePath;
                private Long effectiveAt;
                private String blockchainTransactionId;

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public String getAvatarImagePath() {
                    return avatarImagePath;
                }

                public void setAvatarImagePath(String avatarImagePath) {
                    this.avatarImagePath = avatarImagePath;
                }

                public Long getEffectiveAt() {
                    return effectiveAt;
                }

                public void setEffectiveAt(Long effectiveAt) {
                    this.effectiveAt = effectiveAt;
                }

                public String getBlockchainTransactionId() {
                    return blockchainTransactionId;
                }

                public void setBlockchainTransactionId(String blockchainTransactionId) {
                    this.blockchainTransactionId = blockchainTransactionId;
                }
            }

            public static class SpecsBean {
                /**
                 * type : 0
                 * layers : [{"layerNumber":0,"type":0,"format":0,"subFormat":"string"}]
                 */

                private int type;
                private List<LayersBean> layers;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public List<LayersBean> getLayers() {
                    return layers;
                }

                public void setLayers(List<LayersBean> layers) {
                    this.layers = layers;
                }

                public static class LayersBean {
                    /**
                     * layerNumber : 0
                     * type : 0
                     * format : 0
                     * subFormat : string
                     */

                    private int layerNumber;
                    private int type;
                    private int format;
                    private String subFormat;

                    public int getLayerNumber() {
                        return layerNumber;
                    }

                    public void setLayerNumber(int layerNumber) {
                        this.layerNumber = layerNumber;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public int getFormat() {
                        return format;
                    }

                    public void setFormat(int format) {
                        this.format = format;
                    }

                    public String getSubFormat() {
                        return subFormat;
                    }

                    public void setSubFormat(String subFormat) {
                        this.subFormat = subFormat;
                    }
                }
            }
        }

        public static class ChallengeBean {
            /**
             * challengeCode : string
             * format : string
             */

            private String challengeCode;
            private String format;

            public String getChallengeCode() {
                return challengeCode;
            }

            public void setChallengeCode(String challengeCode) {
                this.challengeCode = challengeCode;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }
        }

        public static class ProductBatchBean {
            /**
             * productNumber : string
             * productName : null
             * productCategoryCode : string
             * productBatchNumber : string
             * blockchainTransactionId : string
             * attributes : [{"code":"string","name":"string","value":"string","sequence":0,"valueType":0,"fieldType":0,"displayFormat":"string","displayFlag":true}]
             * images : [{"code":"string","imagePath":"string","sequence":0,"displayFlag":true}]
             * rawMaterials : [{"code":"string","name":"string","batchNumber":"string","quantity":0,"measurementUnit":"string"}]
             */

            private String productNumber;
            private Object productName;
            private String productCategoryCode;
            private String productBatchNumber;
            private String blockchainTransactionId;
            private List<AttributesBean> attributes;
            private List<ImagesBean> images;
            private List<RawMaterialsBean> rawMaterials;

            public String getProductNumber() {
                return productNumber;
            }

            public void setProductNumber(String productNumber) {
                this.productNumber = productNumber;
            }

            public Object getProductName() {
                return productName;
            }

            public void setProductName(Object productName) {
                this.productName = productName;
            }

            public String getProductCategoryCode() {
                return productCategoryCode;
            }

            public void setProductCategoryCode(String productCategoryCode) {
                this.productCategoryCode = productCategoryCode;
            }

            public String getProductBatchNumber() {
                return productBatchNumber;
            }

            public void setProductBatchNumber(String productBatchNumber) {
                this.productBatchNumber = productBatchNumber;
            }

            public String getBlockchainTransactionId() {
                return blockchainTransactionId;
            }

            public void setBlockchainTransactionId(String blockchainTransactionId) {
                this.blockchainTransactionId = blockchainTransactionId;
            }

            public List<AttributesBean> getAttributes() {
                return attributes;
            }

            public void setAttributes(List<AttributesBean> attributes) {
                this.attributes = attributes;
            }

            public List<ImagesBean> getImages() {
                return images;
            }

            public void setImages(List<ImagesBean> images) {
                this.images = images;
            }

            public List<RawMaterialsBean> getRawMaterials() {
                return rawMaterials;
            }

            public void setRawMaterials(List<RawMaterialsBean> rawMaterials) {
                this.rawMaterials = rawMaterials;
            }

            public static class AttributesBean {
                /**
                 * code : string
                 * name : string
                 * value : string
                 * sequence : 0
                 * valueType : 0
                 * fieldType : 0
                 * displayFormat : string
                 * displayFlag : true
                 */

                private Object code;
                private Object name;
                private Object value;
                private int sequence;
                private int valueType;
                private int fieldType;
                private String displayFormat;
                private boolean displayFlag;

                public Object getCode() {
                    return code;
                }

                public void setCode(Object code) {
                    this.code = code;
                }

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public Object getValue() {
                    return value;
                }

                public void setValue(Object value) {
                    this.value = value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public int getSequence() {
                    return sequence;
                }

                public void setSequence(int sequence) {
                    this.sequence = sequence;
                }

                public int getValueType() {
                    return valueType;
                }

                public void setValueType(int valueType) {
                    this.valueType = valueType;
                }

                public int getFieldType() {
                    return fieldType;
                }

                public void setFieldType(int fieldType) {
                    this.fieldType = fieldType;
                }

                public String getDisplayFormat() {
                    return displayFormat;
                }

                public void setDisplayFormat(String displayFormat) {
                    this.displayFormat = displayFormat;
                }

                public boolean isDisplayFlag() {
                    return displayFlag;
                }

                public void setDisplayFlag(boolean displayFlag) {
                    this.displayFlag = displayFlag;
                }
            }

            public static class ImagesBean {
                /**
                 * code : string
                 * imagePath : string
                 * sequence : 0
                 * displayFlag : true
                 */

                private String code;
                private String imagePath;
                private int sequence;
                private boolean displayFlag;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getImagePath() {
                    return imagePath;
                }

                public void setImagePath(String imagePath) {
                    this.imagePath = imagePath;
                }

                public int getSequence() {
                    return sequence;
                }

                public void setSequence(int sequence) {
                    this.sequence = sequence;
                }

                public boolean isDisplayFlag() {
                    return displayFlag;
                }

                public void setDisplayFlag(boolean displayFlag) {
                    this.displayFlag = displayFlag;
                }
            }

            public static class RawMaterialsBean {
                /**
                 * code : string
                 * name : string
                 * batchNumber : string
                 * quantity : 0
                 * measurementUnit : string
                 */

                private String code;
                private String name;
                private String batchNumber;
                private int quantity;
                private String measurementUnit;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getBatchNumber() {
                    return batchNumber;
                }

                public void setBatchNumber(String batchNumber) {
                    this.batchNumber = batchNumber;
                }

                public int getQuantity() {
                    return quantity;
                }

                public void setQuantity(int quantity) {
                    this.quantity = quantity;
                }

                public String getMeasurementUnit() {
                    return measurementUnit;
                }

                public void setMeasurementUnit(String measurementUnit) {
                    this.measurementUnit = measurementUnit;
                }
            }
        }

        public static class ScanDataBean {
            /**
             * totalScanCount : 0
             * firstScanAt : 0
             * firstScanByUsername : string
             * firstScanByDisplayName : string
             * lastScanAt : 0
             * lastScanByUsername : string
             * lastScanByDisplayName : string
             * verifyAt : 0
             * verifyByUsername : string
             * verifyByDisplayName : string
             */

            private int totalScanCount;
            private long firstScanAt;
            private String firstScanByUsername;
            private String firstScanByDisplayName;
            private long lastScanAt;
            private String lastScanByUsername;
            private String lastScanByDisplayName;
            private long verifyAt;
            private String verifyByUsername;
            private String verifyByDisplayName;

            public int getTotalScanCount() {
                return totalScanCount;
            }

            public void setTotalScanCount(int totalScanCount) {
                this.totalScanCount = totalScanCount;
            }

            public long getFirstScanAt() {
                return firstScanAt;
            }

            public void setFirstScanAt(long firstScanAt) {
                this.firstScanAt = firstScanAt;
            }

            public String getFirstScanByUsername() {
                return firstScanByUsername;
            }

            public void setFirstScanByUsername(String firstScanByUsername) {
                this.firstScanByUsername = firstScanByUsername;
            }

            public String getFirstScanByDisplayName() {
                return firstScanByDisplayName;
            }

            public void setFirstScanByDisplayName(String firstScanByDisplayName) {
                this.firstScanByDisplayName = firstScanByDisplayName;
            }

            public long getLastScanAt() {
                return lastScanAt;
            }

            public void setLastScanAt(long lastScanAt) {
                this.lastScanAt = lastScanAt;
            }

            public String getLastScanByUsername() {
                return lastScanByUsername;
            }

            public void setLastScanByUsername(String lastScanByUsername) {
                this.lastScanByUsername = lastScanByUsername;
            }

            public String getLastScanByDisplayName() {
                return lastScanByDisplayName;
            }

            public void setLastScanByDisplayName(String lastScanByDisplayName) {
                this.lastScanByDisplayName = lastScanByDisplayName;
            }

            public long getVerifyAt() {
                return verifyAt;
            }

            public void setVerifyAt(long verifyAt) {
                this.verifyAt = verifyAt;
            }

            public String getVerifyByUsername() {
                return verifyByUsername;
            }

            public void setVerifyByUsername(String verifyByUsername) {
                this.verifyByUsername = verifyByUsername;
            }

            public String getVerifyByDisplayName() {
                return verifyByDisplayName;
            }

            public void setVerifyByDisplayName(String verifyByDisplayName) {
                this.verifyByDisplayName = verifyByDisplayName;
            }
        }

        public static class AuthenticationMessageBean {
            /**
             * code : string
             * message : string
             */

            private String code;
            private String message;

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
        }

        public static class AuthMessageExtBean {
            /**
             * verifyAxRStatus : 0
             * verifyStatus : 0
             * axrImgVerifyErrorCode : string
             */

            private int verifyAxRStatus;
            private int verifyStatus;
            private String axrImgVerifyErrorCode;

            public int getVerifyAxRStatus() {
                return verifyAxRStatus;
            }

            public void setVerifyAxRStatus(int verifyAxRStatus) {
                this.verifyAxRStatus = verifyAxRStatus;
            }

            public int getVerifyStatus() {
                return verifyStatus;
            }

            public void setVerifyStatus(int verifyStatus) {
                this.verifyStatus = verifyStatus;
            }

            public String getAxrImgVerifyErrorCode() {
                return axrImgVerifyErrorCode;
            }

            public void setAxrImgVerifyErrorCode(String axrImgVerifyErrorCode) {
                this.axrImgVerifyErrorCode = axrImgVerifyErrorCode;
            }
        }

        public static class PointMsgBean {
            /**
             * earnedPoint : string
             * balancePoint : string
             * expirationDate : null
             */

            private String earnedPoint;
            private String balancePoint;
            private String expirationDate;

            public String getEarnedPoint() {
                return earnedPoint;
            }

            public void setEarnedPoint(String earnedPoint) {
                this.earnedPoint = earnedPoint;
            }

            public String getBalancePoint() {
                return balancePoint;
            }

            public void setBalancePoint(String balancePoint) {
                this.balancePoint = balancePoint;
            }

            public String getExpirationDate() {
                return expirationDate;
            }

            public void setExpirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
            }
        }

        public static class OwnershipDataBean {
            /**
             * scantime : 0
             * signature : string
             * type : string
             * euaid : string
             * huaid : string
             */

            private int scantime;
            private String signature;
            private String type;
            private String euaid;
            private String huaid;

            public int getScantime() {
                return scantime;
            }

            public void setScantime(int scantime) {
                this.scantime = scantime;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getEuaid() {
                return euaid;
            }

            public void setEuaid(String euaid) {
                this.euaid = euaid;
            }

            public String getHuaid() {
                return huaid;
            }

            public void setHuaid(String huaid) {
                this.huaid = huaid;
            }
        }

        public static class HiddenProductInfoBean {
            /**
             * order : 1
             * euaid : ABCDEF123456
             * huaid : GHIJKLMN7890
             * message : {"en_US":"Use SALES10 for 10% discount","zh_CN":"使用 SALES10 可享受 10% 的折扣","zh_TW":"使用 SALES10 可享受 10% 的折扣"}
             * image : {"en_US":"5db7bd13e4b084a83abe6ea3.png","zh_CN":"5db7bd13e4b084a83abe6ea4.png","zh_TW":"5db7bd13e4b084a83abe6ea5.png"}
             * imagelink : {"en_US":"https://shop.axr.com/en","zh_CN":"https://shop.axr.com/zhcn","zh_TW":"https://shop.axr.com/zhtw"}
             */

            private int order;
            private String euaid;
            private String huaid;
            private MessageBeanX message;
            private ImageBean image;
            private ImagelinkBean imagelink;

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public String getEuaid() {
                return euaid;
            }

            public void setEuaid(String euaid) {
                this.euaid = euaid;
            }

            public String getHuaid() {
                return huaid;
            }

            public void setHuaid(String huaid) {
                this.huaid = huaid;
            }

            public MessageBeanX getMessage() {
                return message;
            }

            public void setMessage(MessageBeanX message) {
                this.message = message;
            }

            public ImageBean getImage() {
                return image;
            }

            public void setImage(ImageBean image) {
                this.image = image;
            }

            public ImagelinkBean getImagelink() {
                return imagelink;
            }

            public void setImagelink(ImagelinkBean imagelink) {
                this.imagelink = imagelink;
            }

            public static class MessageBeanX {
                /**
                 * en_US : Use SALES10 for 10% discount
                 * zh_CN : 使用 SALES10 可享受 10% 的折扣
                 * zh_TW : 使用 SALES10 可享受 10% 的折扣
                 */

                private String en_US;
                private String zh_CN;
                private String zh_TW;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }
            }

            public static class ImageBean {
                /**
                 * en_US : 5db7bd13e4b084a83abe6ea3.png
                 * zh_CN : 5db7bd13e4b084a83abe6ea4.png
                 * zh_TW : 5db7bd13e4b084a83abe6ea5.png
                 */

                private String en_US;
                private String zh_CN;
                private String zh_TW;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }
            }

            public static class ImagelinkBean {
                /**
                 * en_US : https://shop.axr.com/en
                 * zh_CN : https://shop.axr.com/zhcn
                 * zh_TW : https://shop.axr.com/zhtw
                 */

                private String en_US;
                private String zh_CN;
                private String zh_TW;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }
            }
        }

        public static class RecallInfoBean {
            /**
             * id : string
             * status : null
             * subject : string
             * content : string
             * startTime : null
             * isEnded : true
             */

            private String id;
            private int status;
            private String subject;
            private String content;
            private Object startTime;
            private boolean isEnded;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getSubject() {
                return subject;
            }

            public void setSubject(String subject) {
                this.subject = subject;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public Object getStartTime() {
                return startTime;
            }

            public void setStartTime(Object startTime) {
                this.startTime = startTime;
            }

            public boolean isIsEnded() {
                return isEnded;
            }

            public void setIsEnded(boolean isEnded) {
                this.isEnded = isEnded;
            }
        }
    }
}
