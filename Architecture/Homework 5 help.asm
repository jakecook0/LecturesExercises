.data

a:	.word 5,2,4,3,1	#an 'array' of these integers stored in address 'a' (check memory after assembly to verify)



.text

	li $t1,3
topofExteriorLoop:
	beq $t1,$zero,endofExteriorLoop
	add $t1,$1,-1
	li $t0,8
	
topofloop:
	beq $t0,$zero,endofloop	#endofloop points to label below, this is the loop condition test
	
	#loop body
	addi $t0,$t0,-1
	j topofloop


endofloop:
	j topofExteriorLoop

endofExteriorLoop:
