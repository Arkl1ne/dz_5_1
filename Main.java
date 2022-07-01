public class Main{
    public static void main(String[] args){
        Sites sites = new Sites();
        
        sites.generateSites();
        Site smallestSite = sites.getSmallestSite();
        sites.printSites();


        Site finded = sites.getSiteByTopic("Kids", "pornhub.com");
        if(finded != null){
            System.out.println(finded);
        }else{
            System.out.println("Not found site with topic: " + finded);
        }

        System.out.println("The nearest site is: " + smallestSite.getID());
        
    }
}