String priceDisplayYn =  commonDataService.getcommonB2BData(siteCode, "isPricedisplay", "N", true);
			String priceCurrency =  commonDataService.getcommonB2BData(siteCode, "priceCurrency", "", true);
			String calculateFinancingYn =  commonDataService.getcommonB2BData(siteCode, "calculateFinancingYn", "N", true);
			
			String emiUrl = "";
			String financingUrl = "";
			String smbRegistrationUrl = "";
			if ( runModes.contains("prod")  && runModes.contains("live") && !runModes.contains("soft")) {
				emiUrl = commonDataService.getcommonB2BData(siteCode, "prodEmiUrl", "", true);
				financingUrl = commonDataService.getcommonB2BData(siteCode, "prodFinancingUrl", "", true);
				smbRegistrationUrl = commonDataService.getcommonB2BData(siteCode, "smbRegistrationUrl", "", true);
				if(runModes.contains("ro") || runModes.contains("preqa") || runModes.contains("preqa2")){
					smbRegistrationUrl = commonDataService.getcommonB2BData(siteCode, "stgSmbRegistrationUrl", "", true);
				}
	        } else {
	        	emiUrl = commonDataService.getcommonB2BData(siteCode, "stgEmiUrl", "", true);
	        	financingUrl = commonDataService.getcommonB2BData(siteCode, "stgFinancingUrl", "", true);
				smbRegistrationUrl = commonDataService.getcommonB2BData(siteCode, "stgSmbRegistrationUrl", "", true);
	        }
			
			String hybrisApiJson =  commonDataService.getcommonB2BData(siteCode, "hybrisApiJson", "N", true);
			
			OPLMetaSlingModel metaModel = new OPLMetaSlingModel();
			metaModel.setCalculateFinancingYn(calculateFinancingYn);
			metaModel.setCartUrl(cartUrl);
			metaModel.setEmiUrl(emiUrl);

1. modified by oliver.zuo in master  branch on line
