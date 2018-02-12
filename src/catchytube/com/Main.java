package catchytube.com;


public class Main {

    public static void main(String[] args) {

        String url = "https://dl.pagal.link/upload_file/5570/6757/Latest%20Bollywood%20Hindi%20Mp3%20Songs%20-%202017/Raabta%20%282017%29%20Hindi%20Movie%20Mp3%20Songs/02%20Raabta%20-%20Title%20Song%20%28Arijit%20Singh%29%20190Kbps.mp3";
        String url2 = "http://catchytube.com/d.php?ssn=I0dEZIpG7mrYBhytSRoiEWVsY2pvNkpaRk1adFc5cjV6ZzllSDl3UHIwNlZmNCtFRjU3T3dCK29lVHF4aEhKamRhV1ljK2NlOFprait2TTM3eDlXUHV0QjB3UWpKNXUrTnpEUi8xSXZyM1I0blNzU3gvNGxFdVlZY1ozbjVmWURMUXlRTTJBTVg1cXhocFBnQmhqN3g2bS94dm5xZ0grS25RVzJ4a1NEWGZxZHo3U0E3WVRzazVRT3JmV1lYc1BRRVJMNWVDTGJPK2tlaUlKMTMrMFFyNVZMWUhoUDU4ZXRUYmNvdk5SUmt6UDRUU2ZBSmRySlNnc2JhbDJWSmxmdmlLQ3JFajVJdFh4UmNBbFdpMDJjOFhiNlh3WXpHb25kQm8waE9nTHpqalFETTUvOTU3NVJmaWZPYXBleXIvc3BscXkxZ0s3Y2ZxRSsrWVZXRWMvV1dWQkJGU0xhYXZZaDE2UWNtZGtEcHQrSHhHYWdBTEFqN1h4Z1RUSmx2QnZ6YThxVlRZdWJnZGFGcW0vaFhDM29YN0hvY2c2aXd0OTlBT0hkZEp0UiszOXpUZkgrbE4rZEV6U0dFS1NwZldZNEM1V0VraTRlYk1qMTNrWlZBUHpUQkxBYkdVeFAwaTIrSFRFakZ2RjQrb1o1aW0veTMrRjF6d09GZXNiNEgwVzRDbHhyTU84SGg0dEVsZEw0WDNSbmFtV1BUbDJBdWpvTjdmdkVFSTBiT2xoZnZyRWdTNEQwVldLL21SRUlvT3pleEQ3Vkk3Wm1sYXQ5QStvVkxLMW1pUVJ0TkhTeUllQUVnVHArN0s4ZHJyUkd0d1paWTExcStEL2kvSmFlN3JmTWRHZ0d4UUE4VmM5YzBPQVN5N3FQaVI3T2FDSThPTExzRTI4NzIwQWwzR2pJNkw5MkNJTFBFaTRLVGVDNC8xOXlSNGhJdzVvaWxPbnhWS3QrbTQvNE9oWDhsQlpPNjFiSXV5dnUxSG0wdTlhdlZTTGxmWGp6NUIvQ1M2RT0_EQUALS_&cr=E1fvAuZ1hiAGDpGMxLh4FFp1RVJPcHlLUW41R1RIYTJtaE1MenNFenFFczBIMDgyczdZVlpDa0g2NERCV09CNUFkSTBFYnFLSXlBTlN4dzJkRk9CcDNBT05YTEJTUG9jSzdZbmNnPT0_EQUALS_";
        String url3 = "https://r6---sn-ci5gup-cvhs.googlevideo.com/videoplayback?itag=22&expire=1500139922&sparams=dur,ei,gcr,id,ip,ipbits,itag,lmt,mime,mm,mn,ms,mv,pl,ratebypass,requiressl,source,expire&ei=Mf1pWZHmNZaioQPJ8amgDw&id=o-ALE7cKtXaGI1JGeQ0Go23m2kR2sy5QdJFB3KdCYTg1si&source=youtube&mime=video/mp4&ip=103.195.185.222&key=yt6&gcr=in&ipbits=0&lmt=1499733422357545&requiressl=yes&mt=1500118233&pl=22&mv=u&ms=au&mm=31&mn=sn-ci5gup-cvhs&dur=299.398&ratebypass=yes&signature=5E43E275C280FD30D5192BAF8BC05BA9B7369249.B2F0DE497E23F8CF91A90B3E2BBD315538EC5BC7";
        HeaderReader reader = new HeaderReader(url2);
        if (reader.connect()){
            reader.readHeaders();
            reader.open();
        }

    }



}
