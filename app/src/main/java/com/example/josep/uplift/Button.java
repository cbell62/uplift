    import java.util.Random;
           public class Buttons extends Data {
               public Buttons()
               {
               }
               //program reroll
               //program continue to continue to the next page
               //program option 1-9 to run

               int min=1;
               int max=184;
               Random r = new  Random(); //exclusive
               int randInt=r.nextInt(184)+1;//random int between 1 and 184

   //need to set the first 9 options b/4 they get changed based on users intrests

               public String get_outdoors()
            {
                int randOutdoors=r.nextInt(outdoors.length)+1;
                return outdoors[randOutdoors];
            }
           public String get_indoors()
           {
               int randIndoors=r.nextInt(indoors.length)+1;
               return indoors[randIndoors];
           }
           public String get_creating()
           {
               int randCreating=r.nextInt(creating.length)+1;
               return creating[randCreating];
           }
           public String get_sound()
           {
               int randSound=r.nextInt(sound.length)+1;
               return sound[randSound];
           }
           public String get_sight()
           {
               int randSight=r.nextInt(sight.length)+1;
               return sight[randSight];
           }
           public String get_feel()
           {
               int randFeel=r.nextInt(feel.length)+1;
               return feel[randFeel];
           }
           public String get_memory()
           {
               int randMemory=r.nextInt(memory.length)+1;
               return memory[randMemory];
           }
           public String get_productivity()
           {
               int randProductivity=r.nextInt(productivity.length)+1;
               return productivity[randProductivity];
           }
           public String get_consumption()
           {
               int randConsumption=r.nextInt(consumption.length)+1;
               return consumption[randConsumption];
           }
           public String get_personal_ime()
           {
               int randPersonalTime=r.nextInt(personal_time.length)+1;
               return personal_time[randPersonalTime];
           }
           public String get_socializing()
           {
               int randSocializing=r.nextInt(socializing.length)+1;
               return socializing[randSocializing];
           }
           public String get_small_activities()
           {
               int randSmallActivities=r.nextInt(small_activities.length)+1;
               return small_activities[randSmallActivities];
           }
           public String get_sexual()
           {
               int randSexual=r.nextInt(sexual.length)+1;
               return sexual[randSexual];
           }
           public String get_online()
           {
               int randOnline=r.nextInt(online.length)+1;
               return online[randOnline];
           }
           public String get_leaving_comfort_zone()
           {
               int randLeavingComfortZone=r.nextInt(leaving_comfort_zone.length)+1;
               return leaving_comfort_zone[randLeavingComfortZone];
           }
           public String get_animal()
           {
               int randAnimal=r.nextInt(animals.length)+1;
               return animals[randAnimal];
           }

               public void reRoll() //need to also find a random value thats assigned to a catagory of the users preffered catagories arraylist?
               {
                this.optionOne();
                this.optionTwo();
                this.optionThree();
                this.optionFour();
                this.optionFive();
                this.optionSix();
                this.optionSeven();
                this.optionEight();
                this.optionNince();
               }
               /*public String get_random_catorgory()
               {
                   int randCatagory=r.nextInt();
               }*/
               //first 3 options can be values 4.0+ (if applicable)
               //next 3 options >can< be values 3.0+ (if applicable)
               //next 3 options >can< be values 2.0+ (if applicable)
               //i want to make an array with the catagories and what their value is (1-5)
               //then you can make a another random to find which catagory to use
               public void readInput()
               {
                   ArrayList <String> categories = new ArrayList<String>();
                   for(int i=0;i<categories.size();i++)
                   {
                       categories(input)=input.nextLine(); //this will cause an error... try/catch?
                   }
                   
                   int index=0;
                   
                   //this code requires the user to select the catagories in this order, or they wont be considered
               if(categories(index)==outdoors)
                       {
                           this.get_outdoors();
                           index++;
                       }
               if(categories(index)==indoors)
                       {
                           this.get_indoors();
                           index++;
                       }
               if(categories(index)==creating)
                       {
                           this.get_creating();
                           index++;
                       }
               if(categories(index)==sound)
                       {
                           this.get_sound();
                           index++;
                       }
               if(categories(index)==sight)
                       {
                           this.get_sight();
                           index++;
                       }
               if(categories(index)==feel)
                       {
                           this.get_feel();
                           index++;
                       }
               if(categories(index)==memory)
                       {
                           this.get_memory();
                           index++;
                       }
               if(categories(index)==productivity)
                       {
                           this.get_productivity();
                           index++;
                       }
               if(categories(index)==consumption)
                       {
                           this.get_consumption();
                           index++;
                       }
               if(categories(index)==personal_time)
                       {
                           this.get_personal_time();
                           index++;
                       }
               if(categories(index)==socializing)
                       {
                           this.get_socializing();
                           index++;
                       }
               if(categories(index)==small_activities)
                       {
                           this.get_small_activities();
                           index++;
                       }
               if(categories(index)==sexual)
               {
                   this.get_sexual();
                   index++;
               }
               if(categories(index)==online)
               {
                   this.get_online();
                   index++;
               }
               if(categories(index)==leaving_comfort_zone)
               {
                   this.get_leaving_comfort_zone();
                   index++;
               }
               if(categories(index)==animal)
               {
                   this.get_animal();
                   index++;
               }
             }//end  of readInput
              
           }
    
            //all this does is fill the button with whatever is accesssed in the readInput method above, 
            //requires coding to actually let it be put into android studio
               public void optionOne()
                   {
                       this.readInput();
                       //to andriod Studio...
                   }
                   public void optionTwo()
                   {
                       this.readInput();
                   }
                   public void optionThree()
                   {
                       this.readInput();
                   }
                   public void optionFour()
                   {
                       this.readInput();
                   }
                   public void optionFive()
                   {
                       this.readInput();
                   }
                   public void optionSix()
                   {
                       this.readInput();
                   }
                   public void optionSeven()
                   {
                       this.readInput();
                   }
                   public void optionEight()
                   {
                       this.readInput();
                   }
                   public void optionNince()
                   {
                       this.readInput();
                   } 
               }
