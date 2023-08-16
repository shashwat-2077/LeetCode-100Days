class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051];
        
        for(int[] log : logs){
            years[log[0]]++;
            years[log[1]]--;
        }
        
        int maxPopulation = years[1950];
        int maxYear = 1950;
        
        for (int year = 1951; year <= 2050; year++){
            years[year] += years[year-1];
            if(years[year] > maxPopulation){
                maxPopulation = years[year];
                maxYear = year;
            }
        }
        return maxYear;
    }
}