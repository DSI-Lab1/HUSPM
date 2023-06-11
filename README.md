# HUSPM
This repo hosts the codes of papers related to high-utility sequential pattern mining (HUSPM).

## Requirements
Java programming language.

## Running the program
A simple way is to run the java test file.

## Benchmarks
- The data format used is the same as the provided dataset files. That is, different positive integers represent different terms. In addition, "-1" is used as the itemset separator and "-2" is used as the sequence separator.
- Additional datasets can be accessed from [SPMF](http://www.philippe-fournier-viger.com/spmf/index.php?link=datasets.php).

## Introduction
- **HUSP-SP**: A HUSPM algorithm which uses the compact data structure seqPro to store the necessary information of pattens in a sequence database. Moreover, a new upper bound on utility, namely tighter reduced sequence utility (TRSU) and two pruning strategies are also proposed in HUSP-SP.

## Citation
If these articles or codes useful for your project, please refer to
```xml
HUSP-SP:
@article{zhang2022hu,
  title={{HUSP-SP}: Faster Utility Mining on Sequence Data},
  author={Zhang, Chunkai and Yang, Yuting and Du, Zilin and Gan, Wensheng and Yu, Philip S.},
  journal={ACM Transactions on Knowledge Discovery from Data},
  pages={1--20},
  year={2022}
}
```

## Notes
If there are any questions, please contact us (20s151137@stu.hit.edu.cn).
