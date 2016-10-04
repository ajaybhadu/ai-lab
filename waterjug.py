  

class wjp:
        
	def main(self):
            x = input( "Enter the capacity of first Water jug")
            y = input("Enter the Capacity of the second water jug")
            goal = input("Enter the amount you want in the first jug")
            jug = { 'fir': x, 'sec': y}
            temp = self.hcf( jug['fir'] , jug['sec'])
            if temp%goal== 0:
                self.getSteps( jug['fir'], jug['sec'], goal)
            else: print "wrong input"
            
	def hcf( self, no1, no2):  
            while no1 != no2:  
                if no1 > no2:  
                    no1 -= no2  
                elif no2>no1:  
                    no2 -= no1  
            return no1
            
	def getSteps( self, a, b, goal):
            x=0
            y=0
            if x<a:
                x=a
            if y<b:
                y=b
            if x>0:
                x=0
            if y>0:
                y=0
            if x+y>a and y>0:
                x=a
                y=y-(a-x)
            if x+y>b and x>0:
                y=b
                x=x-(b-y)
            if x+y<a and y>0:
                x=x+y
                y=0
            if x+y<b and x>0:
                y=y+x
                x=0
a=wjp()
a.main()

