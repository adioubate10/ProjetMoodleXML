package dcll.grp7.MoodleQuizXML;

import org.jdom.Element;

public class Multichoice  extends Quiz{
	
	public Multichoice(){
		super();
	}
	
	public void generateMultichoice(Element racine){
		
        ajouterQuestion("multichoice", "name", "Architecture à 3 niveaux ?");
        
        ajouterQuestionTextEtSubQ("questiontext","format","moodle_auto_format","text",
        		 "Que désigne une architecture à 3 niveaux ?");
        
        elemSimple("image", "backupdata/446px-Uncle_Sam_pointing_finger_.jpg");
        
        elemSimple("image_base64", "/9j/4AAQSkZJRgABAQEAqwCrAAD/2wBDAAYEBQY" +
        		"FBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsj" +
        		"HBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoG" +
        		"hYaKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgo" +
        		"KCgoKCgoKCgoKCj/wAARCAJXAb4DAREAAhEBAxEB/8QAHQABAAEFA" +
        		"QEBAAAAAAAAAAAAAAUDBAYHCAIBCf/EAEkQAAIBAwIEBAMFBQUG" +
        		"BQMFAQECAwAEEQUhBhIxQQcTUWEicYEIFDKRoRUjQlKxFjNywdEkYo" +
        		"Lh8PEXJTRDopLC0jdEc3Wjsv/EABsBAQADAQEBAQAAAAAAAA" +
        		"AAAAACAwQBBQYH/8QAOBEAAgICAgIABAMHAwUAAgMAAAEC" +
        		"EQMhEjEEQRMiUWEycYEFkaGxwdHwFCPhFTNCUvEGYiQ0Q//aAAw" +
        		"DAQACEQMRAD8A6poBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQC" +
        		"gFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAo" +
        		"BQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoCnPNFB" +
        		"GZJ5EiQdWdgo/M1xtLsJX0R8vEOjxOUfU7TnG/KsoY/kPnUPjY" +
        		"/qiz4U/oy1k4t0hZHjjnlmkQ/EscDsR+m9ReeFX/Qn/psntH1eI1kTmg0" + 
        		"zUpBuR+6C/1NR/1MfodXjSfbSKi6zcHf9l3AGM7ugPy61B+VX/j/ACOrx/rJFQarM" +
        		"Vz+z5c+nmL/AK1z/V//AK/yH+n/AP2R5TV5mYBtNnAPfnQ/50j5d9xf8A/H/wD2RXX" +
        		"U1L8rW1yv+8VBH6GrF5Efoc/07q1JFWPUbVyR5jLjb40ZP6gVJeRjfsi8GRK6LiOWOQZj" +
        		"dW+RzVikn0ypxce0e6kcFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAo" +
        		"BQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgIbUOJtLspGiM/n3C5zFbr5j" +
        		"AjsSNgfmRVUs0I+y6Pjzl6r8yPueIL6dCNPtoYeb8Mk5L/UqCP8A/qsz" +
        		"8z6I0R8SK/E/8/z7EZeftC6TNxrV0iAZ5bfEZPt8IBx9ao/1EpW2y/" +
        		"4MF1H/AD9S1h4d0gyG4ubRri4K8vm3Ll3IPUEtk1TlnzdSJQuNNPovtP0y" +
        		"zhyFto+oIB3x6Uj8ukdlKX1J2IBV+EBc+gq6JnkVTnuc4qTIaPPWos6ADg71ygfMY" +
        		"PTNGdPnNgnJNcO0CcjZiD7V1OxVFnc23mpyrK8Z/mUDNVssUtUebVtStYiFu/vBB2Dj" +
        		"t6b1OGfKv/KzkseGT2qPS8TvDIsV3YzCTc8qDdsfy9j+da4eS3qSKZeJ7iyY0nVrTVY" +
        		"nezkJaM8skbqUeM4zhlO4rVGamrRklFxdMvqkRFAKAUAoBQCgFAKAUAoBQCgFAKAU" +
        		"AoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAR2qarHZRuEXzZh0QHAz7ntV" +
        		"GXPHHr2XY8Ep/YxLUtWmmiP7SnwMZ8qP4U+o6n6msOTPOXs2Y8UYvS2R1nMt0+bdf" +
        		"g5euMAfIVS46NCdkpbWkxCmUgN2x0qPF9Em16JFLFGUFyzfI4qagymU9lZLaJDslc" +
        		"40znNsrKvL0XAqVbsg3ZVUbjrVi7IMq9qmyB46jvmoVZI+gbHrUqOWfCfntUWztHg4" +
        		"bBO/eo9kuj6B7V1HDwcMDXGiXQwBkUSoWfHVWA5gCBv8ql3sJ0QtzJdadrUN1p8fnC5" +
        		"yJkB/GFHY+tWY5uEg4RyRpujMbO5ivLSG5t25opUDqfUEV6Cdq0YJRcW4v0Vq6RFAKAUAoBQC" +
        		"gFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQELqWqgRMYHAj3HP/" +
        		"N8vb3rJlz38sTVjw1uXZhGt61AXeIS4YANld8ZrJVuzXBN7RD2ttJe3kPnc8lsq5aRm6" +
        		"nsBXJaL1SVozLT7aK3jHwhQRiocq7INt+yTgAdAQNh0rqplcnRcAHHTpU3ZXYx" +
        		"k1FIH077Y60OFQDpVhE97elT0RPhIxgdq49A8k56dahskeDkj0rm/Z0+qMYGd6" +
        		"6Gfe3QUOFNjufWouySGfzojozknG/sa6nYqiNCLZ63bhExHcq7D0VxjOPmKtX0" +
        		"EpWid0SEW8M0aH935hdV/l5tyPzJP1rT498WjLnptMka0FAoBQCgFAKAUAoBQCgF" +
        		"AKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAQ3Ed4sUUdt5hQynL4ODyDq" +
        		"B8+nyzWbyJ18i9l+GO+TNd8T6lPcc9vCpCt8IwcAVkVdLpGtJ1yZh+lEvqotj5kgC8r" +
        		"ELt16V31pl7utozm0uI0uIuUgq3wIvpiqm9M4ruiftYsYaZh7YFQ7dsNpIlbcqThR0N" +
        		"WRkn0Uzv2XABbNSIdA/5VE4fOuDiunT6oJ+dSVnGVBuvSpdoiz42CD3rjQR4Hrmo6JAdq6" +
        		"AxGR7VwIDvmpL7g8kdf6VE7Z4kYRpkjPyrkqSJRTky2MzP8aAfCcGoJt7iW8VHTKc5B1CC" +
        		"SQ4igieUse3T/KtK02/sUPom9CRxp0ckoKyT5mZT/DzbgfQYFbMUaijJldy0X9WFYoBQCg" +
        		"FAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAYH4qWuoR2Ca" +
        		"pYc0kNsjfeIlGWC5yHHy3z7b9jWfNDamavG4y+Rvb6NZWF/NdBPvIDhSTzFt8+m1Z5J8tGt" +
        		"L76JaOGzs2T7ojCWTJaTPqelVyb9nU5Se3ov8ASyLe4We6RTP0RAfwj1qposb9IyCGd55vL" +
        		"G75ztUZJ1siqMjs4jHGWc4J7ZqyEeJTN3pF0QMfSpFZ5OQe1cOnpR023rtHGwB1xXUjh" +
        		"UHQ1NETy+Su1cfR1HgYHzqCJA9DQHzah0+jbJJqSB82wdqAt5pFjA6HfFVylRZGLZZK/JL" +
        		"zIMKTnFRhuRbPapnhrU6hrjWz58h41EgHdAckfI7D5GtsI8pGKUqjZmNbDIKAUAoBQCgFAK" +
        		"AUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgPjqroyuoZWGCCMgig6NC" +
        		"cU6RFw7rdxaEBIGJkjI25kbJX6jBX/AIfesU48Wz1MeVzinRBaPqMdqxluiWs4ASIi/wAW5" +
        		"2NVOMZfmTbfa7ZlegtNcWTX16iJNLIeRSc4XPw/61TOo6s77pGRadfRWyN5MYMzNgvnq3e" +
        		"uJr2clb66JuyvjJOFkJyPyrl07IuOiYVgwBG+atspo+9Md6HD1/Cd6kcA2ArqB6B2FdTIh" +
        		"87Y77HNclZ1FPp6YqJIHPYZogfM/Kh0DOMHFLYPLOADk1xyS7OpFlcsp5io3A61TKafRfB" +
        		"Ndnu1kWRccoGB6VoxSvTKciadlxoeDq1/j+BIwd+55jWvAtszZukTtaDOKAUAoBQCgFAKA" +
        		"UAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAYP4qaKdQ0qG+iUG" +
        		"a0JVge8b4B/I8p+WapzxTjbNXi5HCVfU0BdzxcsNlbhZJs5lYbnr39qzXab+ht4/MZBo" +
        		"+uLLG1lZ87NGwWIgZTB6nNUyi2+R1JJ0zLLadJdUigWQCNF2K/iZu/0qCfsPr6mVWLuki" +
        		"AH4eXr61CQ00TlnztynoM+tSgm2VzpIvCMjbPWrCo+k7bdKHD0CMbjc1I5R6DbDFNnKDn4RR" +
        		"6CWzwSB/zqN7JUzyeu9ADuaM6AMAelSBTlHMpquatEoumRl2/Ij8h6DvWe0pJGhLWy6tHDx" +
        		"p8IBxWvGzPNUXfDILSanMejXPIvyVFH9c1s8d2n+Zmz/wDivsTdaDOKAUAoBQCgFAKAUAoBQ" +
        		"CgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAU7mFLi3khlGY5FKsPY1xq1T" +
        		"Op07OSuNVPCvEd1bLmO5lkZVCIDz4OCfbP8AnWOpU1fR60pKSUvTPGi3Mtpd25gnaN5F5W" +
        		"iI9T1qM43J2jjadL2bP0uOHTI7ZmBn1GQeWMAZAJrLL6HU3JtejJLGVQyKc5O3Marf1s7dE" +
        		"9ZPhwuc71KOnojNaJEncn9KuKKPuTtmutCh6ZoD6Dtt0ocaDNsAaMJHk4NRO7C/EBvvXDr0O" +
        		"b9DXb0co+lvapCimxO4qMiSITU5CSyv3GwzWO3fzGqEV6KunTLJNbxK6/CnMwzvW7G/lsy5Lt2" +
        		"T/DluYNNJYkvNK8rE+7H/ACxW3x1UEZPIdzr6EpV5SKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgF" +
        		"AKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKA0P4/actprlnq0SAkx4ckZHXH/4/nWbIqn+Zv8" +
        		"eTeNr6GpNIu54NQF6HTzI3ZcN2yKhOKaeuy3cvRtLSVYW8d1M7S3E5xCDjOG/i9qyTVWixS9L" +
        		"0ZJBewfeGt/M5pYQFIzneq/h/Q4nezIdJuAZGwwb132FcVpoSqtE4sobIGDtjarbKqPMl1BA" +
        		"uZ5URR3JrnNXQ4N9ERecT6dbsP36FQd3LBV/OrY45y6RCU4x1JkFeeK3CNgZFn1aMsvVY1Ln" +
        		"5DA3rRDw80tqJV8eD62fY/Fng6WzjuF1eMhxnyuRvMHsVxmj8PLdUcWeL6TMf1Lxu0eDmFl" +
        		"p1/cYOOdgsYORtjO9Xf9NnW2jnx2/wohpfHMxMhk0VgCeizAkj8qtj+yk26Zx+RKvRRm8d5FB" +
        		"8rQs7nBefG35U/wCktPbOf6mcukfYvGu/kIVtFijOA396WGPnipL9mdKxPyJK6J7TvFW4uuU" +
        		"zaLIFJAHlSgsc+xqqf7Mfp0MfkN9om49dttRuVHM0c2PwTDlNeTk8DNjfJqz0MWeDVdExw+v" +
        		"+2s0rBSUCgHrTFPtMZlrRnOmoUsIFYYIQV6uL8CPNyu5uy5qwrFAKAUAoBQCgFAKAUAoBQCg" +
        		"FAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAa68cNLS/wCFlkbAMbMnM3RQVJyf" +
        		"qi/nVGfVP7mrxW7aX0OabOZERZ2YYYgZA/CenSqmk0bE3y0Zlaa/b2OlpEyP97EnlROT8KIe" +
        		"5Pr2qiS2/wCIb33+Zcwa9BpAlnvGWCMMDzOSWYAbmroePKe09FWbLHr9xUbxPt1DDQ9Our+" +
        		"RyDzEeXGPmTvWqH7ObpMofktERqnirxBcSrFZ29tZB03IYuffBq5fs+Hve/qV/wCqd+jEbvjP" +
        		"V710Mt+3OGwItwBv7da0R8THB8lH2QlnyO4ybIa71E3NzL96mnZcgjLEjPyrSoQjbqmUKTr6" +
        		"m1fBfg+y4q0TiVdQt4hC4S2t5CmXhlALc4PXbK/OsHmeRLHkXB1Rqww1ctp/xMF4z4Y1DhHWG" +
        		"tL/AOLDZjkUfDKv8w/zrXgzRzK4uvqRy4uDTW0yDs7wGNVblbJJA9frVyfKPZQ4+0tFUy2zs" +
        		"vmxk4JyB/DvUXVSaSOfh0XF3LDFKFicuA2RkYG1TUbd1/EK0rez5BqcaOQOYpk4Poagl" +
        		"TWqOu5aRJ6XrggnDShljRQVLHrRxTit9nVNpEJxZ4kagzfdtLtktvKP/qXJLN8vSs8uUU6d" +
        		"Ik4uW2VdI4441ispNTl1+9YRqDEhtgYmbG2TtWaXh4pXyW/3FsZ5klTf7/6HdOmGQ6baGZla" +
        		"XyU52XoTyjJHtVcapceiuXbLmunBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoB" +
        		"QCgFAKAUAoBQCgFAKAUAoBQGJeKtkL/gfUI3mEKJySsxOAQrAkfXGPrVWb8Nl2B1kRxrqt9b" +
        		"WDPLLIkIWbmCluYkdRgVHHBTSlZry5FjdMsLjj2Bkma1sXe4JBWS5YFUx3CDrW/HhxqD/qYP" +
        		"i5G1vj+RbaDeXmpXlxdatIbh2I5Fl3B+Q6AYrTD5ISqjjTbUm9/Uy+2uv3Y5WMTHPKgOAalO" +
        		"Len9DjaTrsx29uYkUhVcz55eYdFPXBqVKo6ILu5ei0528sxgAhcMSexG+KRUKvfY5NPR7hlk" +
        		"cybBXGwU/wAx6YrspJJ8ZMJJVZ154PaKdG4G0+GZAlzNzXE3uzdP0ArwPJyOeVtuzeoqKpdH" +
        		"zxf4U/tLws7W6c1/ZgywALkuMbp9aePleHJyX6jippxfv/LOVrDTfOv2hnea1SNsSOYuYx74" +
        		"Pw17qtxi41Rin/tyakto9XOjQw6hL511HNaKwKSKOQvn2NcUdaXsOWrX8Spc2Vl5oLMAd/iV" +
        		"seh3qU/kTdHL5IoXEFvhZcg5OcR/1NHKN9+jm29Ijr5v9kPluHY5HTA+Qqal1x" +
        		
        		"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" +
        		"PJr3Cn9oNOeOebTIzLlCCHg6vg+o6/Q1V4uV+POpaXsuqOW" +
        		"Py1/wA/Q5+i1OOdYmEkbgfCmDvivcUlaV9mJppaK51bT4JXFxOYT/Cuc" +
        		"g7YrnyprZ1SRa31rNrkNtcWOl3VzaNJ5aOIiUdgfXt86z5PIxxXBtX" +
        		"9C5YsklyS/U2Nwvwjf6NoPEVjc6zb2N5qsEdoklgDcSRRhgXGRjqoI6" +
        		"968fyfLjnqlrtmjHj1q3/AhtL8BYLW9t5riW4vbXqRKBEvtkZzVc/2hS+WP7zsfHfbaX8TZGiW+i8N" +
        		"6YLTTXt4ogWCpFJ8BPck152XNLJK2zZCCeiN1XxDtdJgkVZzNOOiY+FTiuxhKW1on8OmtGtNR4p1zj" +
        		"jURaTXH3e0YnmiRuQyL3FaVihii5PcvuRcKfymSW1p5cCaNoUSI3IDLMB" +
        		"lYQf4Sf5jvXXOTfOT0UyjF9mS8MXNjZLFwvpDKZpG87UJ85278x9eoFQ+" +
        		"HLI1OfSCkrpeujfPDViLKwXChAyqqoP4UA+Efqfzr0cEGk5P2Ys01J0iX" +
        		"q8pFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFACcDJ6UBi" +
        		"3EHFi2LeRp0MdzcFiuZZPLjXbOc4JP/W9Zn5KbqH7zTHx6XKbpGKz+ID2" +
        		"iGTU9a01BnlKWNu8pB9MnP9Kpl5Duoy/ci2OCMvwxk/4FH/xREqILG11S" +
        		"4J2Ektp5Sn33FVvNmXf9Cx+Kn0l+8+y+I14vKzwXMKkY3iDYP5ZqDz51" +
        		"u/5En40Etr+JWtfFBFVFu3gSUty/vEZM/nVkfKy3WiiXjQXtr9Cz8Re" +
        		"KNa4k8PdRtuB3t49WlCr5q3SqyoW+PkPTmI23Pc98VevIbdTjoqeCKf4k" +
        		"craPxHxtouuvpRiuZboPiW0uIuY5J6kgdN+ta3ijlSb2RTlCTUX/ABNw" +
        		"+Nfhjd8S8OafqWlRiXiCziCyW0bZE0eMsFz/ABA9B3zj0rzcOb4eRxa0" +
        		"zY4LLCr2uv7fqcw27SW1yrAFXBwexHqDXtwVq67MEl6Zkdpq5NtJHzDm5gwcnJPbHyrV" +
        		"ijHqvRXJOy/S+sbfSZboXoa/Nx5P3MgjMZXPMD86inUoq9HE7e+/r6LYa4sdvLdKj+aw+AbY" +
        		"XHpUnkio6Zx29JHR/GXEj+F/hBw9pltEw1y+tQscb5UxyMvPJI3+EtjHrXiyg/I8lxT/AD/L" +
        		"/k3vJ8NXV+jnPTJBeXyXWpTc8k0vPLLI2Cxz3r3IxUVSqkjDKbu2ZpqeqWcyySzahZzLGVVVw" +
        		"SzKPf0pxSoqhaVJNJkNDe+fO6W6yysSTiHc46Dp86jBxjFOZYouXRPfsDia4njt7LS71w4/GyH" +
        		"H1JrM/N8dW1L2SjgnSs2N4fcDcV2N1eQatevBoF7aSQXNqkvMXLqV2HReted5vnY8sGo" +
        		"q/oXQwyi1OL3ZEx/Z1hWOFYuI70EOeYLbgbZ2wc7HHeql+0st3X8S6WGM9Voz5fDD" +
        		"hrT7Sx+8aVpcQso+Vbm6HPISN+ZzkBjn1rFk83I27nX6/wAi2OJJU3+7+n0/QpavxZwN" +
        		"w/bRx6jrS3bRp8NvbseX6Ku1ZouWSXyRb+5ohi/9Y1+ZgWt+PtjZwNb8K6UiAdDMvKMeu" +
        		"BvWuPi5JP5tHWvc5Gudb8V9W1dyt/cNL8QIjT4IwO4x3q+PiK7/AJhZMcPwLZEpxNd" +
        		"Xdv5TXEVpbKSOVNgc1P4UU77ZL4zmts8WutW8Tq1zMZUC4ZWU4b5e9dcG+iLzVsnjf2" +
        		"aXySaBMrcmC0r7EZHvVMYS4vmdlmi2qLafirVdKlls9Gkhh8whnYYJd/5iatWFTXKZT" +
        		"Npuos3L4C3XDk5txeK0mrhmkuWdctI2dj7oPT/tXdRl83SK5qcY0l+v+ezZWvcUa9Z+IU" +
        		"1nE0MmjeXD5SgcpDEZZub+LOenTb8qs/mJSai/w/x1f9TmLxbhyfs2Fpd/Hf2/OhAddnU" +
        		"djWvBmWWPJGXNieKVMvKuKhQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoC" +
        		"y1l2j0+Qr6gH86z+U6xsv8dXkRp/xDuJI9Yu49QYR6dbJFNGFP97kbkn552rypSfJxP" +
        		"XxpLEsiVt3+hr6fxEFq1ydP062igXaJuQDnOcZxWmOFtIokpN/NIsLrxC1e8u1T74baI" +
        		"JsfKyMiuPDS6JYvHinctkPc");
        
        		

        balContenantUnElem("generalfeedback", "text", "Rappel N tiers : architectures " +
        				"multi-niveaux pouvant être " +
        				"distribuées sur plusieurs noeuds physique d'un réseau.");
        
        
        
        elemSimple("defaultgrade", "1");
        
        elemSimple("penalty", "0.1");
        
        elemSimple("hidden", "0");
        
        elemSimple("shuffleanswers", "1");
        
        elemSimple("single", "false");
        
        elemSimple("shuffleanswers", "true");
        
        
        balContenantUnElem("correctfeedback", "text", "");
        
        
        balContenantUnElem("partiallycorrectfeedback", "text", "");
        
        
        
        balContenantUnElem("incorrectfeedback", "text", "");
        
        
        elemSimple("answernumbering", "none");
        
        
        getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","-100").addContent(
        		new Element("text").
        		setText("Une architecture MVC")).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText("Une application non distribuée " +
        										"peut implémentée MVC."))));
        

        getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","100").addContent(
        		new Element("text").
        		setText("Une architecture N tiers ou N vaut 3")).addContent(
        						new Element("feedback").addContent(
        								new Element("text"))));
        
        
                
        
        
	}
	
	public void generateMultichoisebis(Element racine){
		
        ajouterQuestion("multichoice", "name", "Architectures N tiers");
        
        ajouterQuestionTextEtSubQ("questiontext","format","moodle_auto_format","text",
        		 "Cocher les assertions vraies.");
        
        elemSimple("image", "backupdata/446px-Uncle_Sam_pointing_finger_.jpg");
        
        elemSimple("image_base64", "/9j/4AAQSkZJRgABAQEAqwCrAAD/2wBDAAYEBQY" +
        		"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" +
        		
        		"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" +
        		"PJr3Cn9oNOeOebTIzLlCCHg6vg+o6/Q1V4uV+POpaXsuqOW" +
        		"Py1/wA/Q5+i1OOdYmEkbgfCmDvivcUlaV9mJppaK51bT4JXFxOYT/Cuc" +
        		"g7YrnyprZ1SRa31rNrkNtcWOl3VzaNJ5aOIiUdgfXt86z5PIxxXBtX" +
        		"9C5YsklyS/U2Nwvwjf6NoPEVjc6zb2N5qsEdoklgDcSRRhgXGRjqoI6" +
        		"968fyfLjnqlrtmjHj1q3/AhtL8BYLW9t5riW4vbXqRKBEvtkZzVc/2hS+WP7zsfHfbaX8TZGiW+i8N" +
        		"6YLTTXt4ogWCpFJ8BPck152XNLJK2zZCCeiN1XxDtdJgkVZzNOOiY+FTiuxhKW1on8OmtGtNR4p1zj" +
        		"jURaTXH3e0YnmiRuQyL3FaVihii5PcvuRcKfymSW1p5cCaNoUSI3IDLMB" +
        		"lYQf4Sf5jvXXOTfOT0UyjF9mS8MXNjZLFwvpDKZpG87UJ85278x9eoFQ+" +
        		"HLI1OfSCkrpeujfPDViLKwXChAyqqoP4UA+Efqfzr0cEGk5P2Ys01J0iX" +
        		"q8pFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFACcDJ6UBi" +
        		"3EHFi2LeRp0MdzcFiuZZPLjXbOc4JP/W9Zn5KbqH7zTHx6XKbpGKz+ID2" +
        		"iGTU9a01BnlKWNu8pB9MnP9Kpl5Duoy/ci2OCMvwxk/4FH/xREqILG11S" +
        		"4J2Ektp5Sn33FVvNmXf9Cx+Kn0l+8+y+I14vKzwXMKkY3iDYP5ZqDz51" +
        		"u/5En40Etr+JWtfFBFVFu3gSUty/vEZM/nVkfKy3WiiXjQXtr9Cz8Re" +
        		"KNa4k8PdRtuB3t49WlCr5q3SqyoW+PkPTmI23Pc98VevIbdTjoqeCKf4k" +
        		"craPxHxtouuvpRiuZboPiW0uIuY5J6kgdN+ta3ijlSb2RTlCTUX/ABNw" +
        		"+Nfhjd8S8OafqWlRiXiCziCyW0bZE0eMsFz/ABA9B3zj0rzcOb4eRxa0" +
        		"zY4LLCr2uv7fqcw27SW1yrAFXBwexHqDXtwVq67MEl6Zkdpq5NtJHzDm5gwcnJPbHyrV" +
        		"ijHqvRXJOy/S+sbfSZboXoa/Nx5P3MgjMZXPMD86inUoq9HE7e+/r6LYa4sdvLdKj+aw+AbY" +
        		"XHpUnkio6Zx29JHR/GXEj+F/hBw9pltEw1y+tQscb5UxyMvPJI3+EtjHrXiyg/I8lxT/AD/L" +
        		"/k3vJ8NXV+jnPTJBeXyXWpTc8k0vPLLI2Cxz3r3IxUVSqkjDKbu2ZpqeqWcyySzahZzLGVVVw" +
        		"SzKPf0pxSoqhaVJNJkNDe+fO6W6yysSTiHc46Dp86jBxjFOZYouXRPfsDia4njt7LS71w4/GyH" +
        		"H1JrM/N8dW1L2SjgnSs2N4fcDcV2N1eQatevBoF7aSQXNqkvMXLqV2HReted5vnY8sGo" +
        		"q/oXQwyi1OL3ZEx/Z1hWOFYuI70EOeYLbgbZ2wc7HHeql+0st3X8S6WGM9Voz5fDD" +
        		"hrT7Sx+8aVpcQso+Vbm6HPISN+ZzkBjn1rFk83I27nX6/wAi2OJJU3+7+n0/QpavxZwN" +
        		"w/bRx6jrS3bRp8NvbseX6Ku1ZouWSXyRb+5ohi/9Y1+ZgWt+PtjZwNb8K6UiAdDMvKMeu" +
        		"BvWuPi5JP5tHWvc5Gudb8V9W1dyt/cNL8QIjT4IwO4x3q+PiK7/AJhZMcPwLZEpxNd" +
        		"Xdv5TXEVpbKSOVNgc1P4UU77ZL4zmts8WutW8Tq1zMZUC4ZWU4b5e9dcG+iLzVsnjf2" +
        		"aXySaBMrcmC0r7EZHvVMYS4vmdlmi2qLafirVdKlls9Gkhh8whnYYJd/5iatWFTXKZT" +
        		"Npuos3L4C3XDk5txeK0mrhmkuWdctI2dj7oPT/tXdRl83SK5qcY0l+v+ezZWvcUa9Z+IU" +
        		"1nE0MmjeXD5SgcpDEZZub+LOenTb8qs/mJSai/w/x1f9TmLxbhyfs2Fpd/Hf2/OhAddnU" +
        		"djWvBmWWPJGXNieKVMvKuKhQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoBQCgFAKAUAoC" +
        		"y1l2j0+Qr6gH86z+U6xsv8dXkRp/xDuJI9Yu49QYR6dbJFNGFP97kbkn552rypSfJxP" +
        		"XxpLEsiVt3+hr6fxEFq1ydP062igXaJuQDnOcZxWmOFtIokpN/NIsLrxC1e8u1T74baI" +
        		"JsfKyMiuPDS6JYvHinctkPc");

        

        balContenantUnElem("generalfeedback", "text", "Rappel N tiers : architectures " +
        				"multi-niveaux pouvant être distribuées " +
        				"sur plusieurs noeuds physique d'un réseau.");



        elemSimple("defaultgrade", "1");

        elemSimple("penalty", "0.1");

        elemSimple("hidden", "0");

        elemSimple("shuffleanswers", "1");

        elemSimple("single", "false");

        elemSimple("shuffleanswers", "true");


        balContenantUnElem("correctfeedback", "text", "OK");


        balContenantUnElem("partiallycorrectfeedback", "text", "");



        balContenantUnElem("incorrectfeedback", "text", "KO");


        elemSimple("answernumbering", "abc");


        
        
        
        
        
        ajouterAnswer("0", "Une architecture N-tiers est uniquement une architecture " +
        				"à base de Web Services",  "Une architecture distribuée peut " +
        										 "reposer par exemple sur RMI");
        /*getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","0").addContent(
        		new Element("text").
        		setText("Une architecture N-tiers est uniquement une architecture " +
        				"à base de Web Services")).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText("Une architecture distribuée peut " +
        										"reposer par exemple sur RMI"))));*/
        

        ajouterAnswer("33.333", "Une architecture client " +
        		"serveur est une architecture N-tiers", "vide");
        /*getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","33.333").addContent(
        		new Element("text").
        		setText("Une architecture client serveur est une architecture N-tiers")).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText("vide"))));*/
        
        
        ajouterAnswer("33.333", "Une architecture N-tiers correspond à une architecture " +
        				"d'application distribuée sur plusieurs noeuds physiques", "vide");
        /*getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","33.333").addContent(
        		new Element("text").
        		setText("Une architecture N-tiers correspond à une architecture " +
        				"d'application distribuée sur plusieurs noeuds physiques")).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText("vide"))));*/
        
        ajouterAnswer("33.333","Une application web est une application reposant sur une " +
        				"architecture N Tiers", "vide");
        /*getQuestion().addContent(new Element("answer")
        .setAttribute("fraction","33.333").addContent(
        		new Element("text").
        		setText("Une application web est une application reposant sur une " +
        				"architecture N Tiers")).addContent(
        						new Element("feedback").addContent(
        								new Element("text").setText("vide"))));*/
        
        

	}
	
	
	 static void lireMultiChoice(Element courant )
	    {
	    	 //System.out.println("  "+courant.getAttribute("type").getValue());
	    	lireDeuxBalise(courant, "name", "text");
	    	lireDeuxBalise(courant, "questiontext", "text");
	    	lireUneBalise(courant,  "image");
	    	lireUneBalise(courant,  "image_base64");
	    	lireDeuxBalise(courant, "generalfeedback", "text");
	    	lireUneBalise(courant,  "defaultgrade");
	    	lireUneBalise(courant,  "penalty");
	    	lireUneBalise(courant,  "hidden");
	    	lireUneBalise(courant,  "shuffleanswers");
	    	lireUneBalise(courant,  "single");
	    	lireUneBalise(courant,  "shuffleanswers");
	    	lireDeuxBalise(courant, "correctfeedback", "text");
	    	lireDeuxBalise(courant, "partiallycorrectfeedback", "text");
	    	lireBalireComplexeAnswer(courant,"answer","feedback","text");
	    	
	    }

}
