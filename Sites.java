public class Sites {
    private Site[] Sites;
    private int NumberOfSites;

    public void generateSites() {
        Site pornhub = new Site("pornhub.com", "Kids", 7916640);
        Site xvideos = new Site("xvideos.cos", "nudes", 32602702);
        Site youporn = new Site("youporn.com", "scam", 256598);
        Site xnxx = new Site("xnxx.com", "surprise", 260000);

        Sites = new Site[4];
        Sites[0] = pornhub;
        Sites[1] = xvideos;
        Sites[2] = youporn;
        Sites[3] = xnxx;

        NumberOfSites = 4;
    }
    
    public Site getSiteByTopic(String Domen, String Topic) {
        for (int i = 0; i < NumberOfSites; i++) {
            if (this.Sites[i].getTopic().equals(Topic) && this.Sites[i].getDomen().equals(Domen)) {
                return this.Sites[i];
            }
        }
        return null;
    }

    public Site getSmallestSite() {
        Site min = Sites[0];
        for (Site Site : Sites) {
            if (Site.getQuantity() < min.getQuantity()) {
                min = Site;
            }
        }
        return min;
    }

    public void printSites() {
        for (Site Site : Sites) {
            if (Site == null) 
                break;
            System.out.println("Site");
        }
    }
}