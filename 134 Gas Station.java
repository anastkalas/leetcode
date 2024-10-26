class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length == 1 && gas[0]/cost[0] >= 1){
            return 0;
        }
        else if(gas.length == 1 && gas[0]/cost[0] < 1){
            return -1;
        }

        int sumg = 0;
        int sumc = 0;
        for(int i = 0;i<gas.length;i++){
            sumg = sumg + gas[i];
            sumc = sumc + cost[i];
        }

        if(sumg<sumc){
            return -1;
        }
        
        for(int i=0;i<gas.length;i++){
            if(gas[i]>=cost[i]){
                int tank = gas[i]-cost[i];
                int station = i;
                if(station < gas.length-1){
                    station = station + 1;
                }
                else{
                    station = 0;
                }
                while(station != i && tank > 0){
                    tank = tank + (gas[station] - cost[station]);
                    if(station < gas.length-1){
                        station = station + 1;
                    }
                    else{
                        station = 0;
                    }
                    if(tank < 0 || (tank == 0 && station != i)){
                        break;
                    }
                    else if(tank >= 0 && station == i){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
