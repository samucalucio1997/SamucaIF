main: addi $2 $0 5
      syscall
      add $8 $0 $2
      addi $2 $0 5
      syscall
      add $9 $0 $2
      addi $2 $0 5
      syscall
      add $10 $0 $2
      
      sub $15 $8 $9
      add $11 $15 $0
      not $11 $11
      
      srl $15 $15 31
      srl $11 $11 31
      
      mul $12 $15 $9
      mul $13 $11 $8
      add $7 $12 $13
      
      sub $16 $7 $10
      add $11 $16 $0
      not $11 $11
      
      srl $16 $16 31
      srl $11 $11 31
      
      mul $17 $16 $10
      mul $18 $11 $7
      add $4 $17 $18
      addi $2 $0 1
      syscall