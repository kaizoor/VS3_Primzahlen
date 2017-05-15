# Makefile das zwei Abschnitte geteilt wird, so dass nur im oberen
# Abschnitt Variablen und Abhängikeiten zwischen Modulen angepasst
# werden müssen .
# Autor: Michael Sauer (16.01.2012)
# Historie
# 15.02.2017: Abhängigkeit zwischen Modulen eingefügt (M. Sauer)
#
# Aufruf: make, make m4.out, ebenso make main.o, make feld.o ...
# 

PROGRAM=menu.out
OBJECTS=menu.o scanflib.o

CC=gcc
DEBUG= 
LFLAGS=
CFLAGS=-Wall -std=c99

.PHONY: all
all: $(PROGRAM)

#Abhängigkeiten zwischen Modulen
menu.o: scanflib.h


#--------- ab hier nicht mehr ändern

$(PROGRAM) : $(OBJECTS)
	$(CC) $(OBJECTS) -o $(PROGRAM)

%.o : %.c %.h
	$(CC) -c $(CFLAGS) $< -o $@

.PHONY: clean
clean:
	-rm *.o
	-rm *.out

