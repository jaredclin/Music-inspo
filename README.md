# Music-tool
Tool for riff ideas.  
Usage:  
  javac \*.java  
  java Musictool  
  enter the following: key, root note, text  
  
  Current functionality:  
  
  -converts text to sequence of notes under music theory constraints  
  -supports all major/minor scales  
  
Music theory rules implemented:  
  -notes are all within same scale  
  -the next note shall be within one octave (classical melody composing)  
  
Roadmap:  
  -more scales? diatonic, chromatic...)  
  -use JMusic library to output said notes into a midi file  
  -create interface rather than using command line  
  -random melody generator (would just be random string, low prio)  
  -beat generator  
