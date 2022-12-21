package eu.happycoders.adventofcode2022.day21;

/**
 * Advent of Code 2022 – Object-Oriented Solutions in Java.
 *
 * <p>Main application for day 21.
 *
 * @author <a href="mailto:sven@happycoders.eu">Sven Woltmann</a>
 */
class Main21 {

  private static final String INPUT =
      """
          cjdb: 3
          hhfs: 5
          jvjn: 4
          tjzm: bngm * mrfm
          mbbs: 2
          dzlq: tcdz * bjdj
          htzp: 3
          hsmn: 5
          sblh: 2
          pghw: 5
          pqtp: vtcr * bcts
          mvgz: 2
          sszn: 3
          zqlr: nlfq * htfq
          djsb: 2
          vccw: zzsz * thbz
          tlvg: fncr + glvj
          grql: nqch * jhmw
          rngv: 4
          prjv: 2
          rmdl: lzdr * qpzh
          pdqm: 2
          jrpn: zcnv + pgqr
          llzf: 2
          bzfp: qbwz + zsts
          bvsf: rbcd + npcs
          jmpm: 3
          zgrs: 15
          lcrs: 5
          cqcc: swtj + wnzt
          vhts: 2
          pbgz: 1
          mqpb: 2
          jzcf: 2
          sfls: 10
          cnhh: 8
          clsh: mcwb * jfrq
          cqch: 4
          brvd: 19
          fprh: 2
          dccm: gbhn / tczb
          wmgt: ldsd + csmf
          hbrs: 6
          bjqq: 12
          pvnl: 6
          htdg: 2
          tpcm: hfdz * sfrt
          sgcj: slfv * wzdf
          fljs: 2
          qmml: 2
          sbqt: 2
          wjqn: 4
          fmzj: 1
          dnwt: 18
          dzld: rvhr * jfjj
          qnfn: mrhp * wlhj
          sccz: 3
          lbcv: hqjn + lhcg
          bwdw: 16
          jmgq: czzm * sjqr
          zqnd: fhfm + sstq
          mlwd: 3
          mpnz: vdqm * ccgq
          bcsn: cmrp * prhj
          gsvq: cqcc / twjg
          zcgv: 4
          sjvd: cvsz * zdmr
          fzwf: 5
          cdpv: 1
          ndcq: 4
          mvps: 2
          twsv: qfsn * pmrb
          gglt: nlnl * cjdb
          pvnm: 1
          wcfh: 7
          gcsp: lwmn * tpvb
          hqrz: pfwb + dprd
          gzld: cngd * njgr
          blbt: jsqr * mgbt
          nbfs: wmnj * mzwr
          ngbr: 10
          tnwm: 3
          mssq: 3
          jzvg: znlc * wmmc
          vzhd: chjz - lmvd
          stft: 12
          fqfv: zhmq * lzpj
          fcmh: szcs / cfcw
          hhjn: pcgb + zzqg
          fngp: 2
          cgmt: 17
          szbw: 6
          bqwr: 2
          dffj: 1
          hzvr: 2
          wmcd: fvvf * gvzz
          fttq: hqlf * tccz
          zwvs: 5
          hghz: hzsf * ltjm
          vpvz: zcqm * gjjf
          dcbt: 10
          vtlf: pwnh + pbgz
          phqc: nnmm + hddj
          zsts: lmbg * clbg
          pcgb: lzmn / djsb
          mphq: 9
          frnt: 17
          sfnm: rjhs * cjlp
          hqjn: gfmp + bsdv
          vfqq: pdfr * srrd
          jrlg: cqrl + grbt
          zsvp: 9
          tbrl: 2
          zrbf: 3
          bfrr: 4
          bcgp: hhgj + gbsh
          pvbm: hbmj * lwqm
          wrzq: 1
          lbqt: ldvp * wnrt
          tdrm: 11
          wbmz: 3
          szcl: pqcj + clln
          jhmw: 2
          qcht: gsws * ddzc
          mnvc: mpdv + gszq
          gpbh: vpjf * fwlr
          fjnp: svld + ntlr
          lfjm: lqcs + mwns
          hsgb: rqgl * gndg
          wlrf: 3
          ztzf: 5
          gwnd: 3
          ffnm: wllq * jzcf
          dtgf: 5
          hbcq: lnvb * sbfl
          clpd: dzmh / bhfg
          hzws: 1
          fhdr: 5
          hnnf: 4
          rcbh: 3
          tflh: hfcf * ntnn
          tcpd: qvgc + ntcs
          ftdp: 2
          nfsf: hnmp + fbvf
          vrzm: ljmj * dqlb
          bhrj: 2
          gcct: fzzf + gjtj
          pqqc: mbbs * rttr
          vhtv: hddv * zdfd
          gfhb: 2
          qffv: 5
          jmpl: svtn - cfpj
          glzt: 4
          qgqv: gglt + fdgq
          vnvc: cmgj + bcqv
          fjmr: 3
          nvbq: htmc + rbwn
          jzqb: cfqs + vccw
          pvfp: zqrj * mscb
          bpnd: 3
          qtsn: qshq + hfwg
          ssnz: 3
          cnqt: 2
          mctw: 2
          qmfg: jbmp * ctsh
          vqfh: 11
          mzbg: 2
          tcvn: 3
          tjfn: stqr + dnvh
          ljmc: 5
          crbw: 2
          zwnc: ndvl - gpns
          wwfm: 5
          fwlr: 3
          zlqh: jfhc * rthw
          qmnd: vjrn * nnjr
          mbhg: 15
          cmht: 2
          spth: 3
          mtdl: fqrr + mqph
          hcbg: jfhh * tnwm
          gjdh: ngcb * wtdr
          mscw: wgnz * dsgb
          fmpt: mmrd * fbnc
          dhsd: 3
          ptfb: 3
          vwdn: 2
          rhdh: 2
          jbhh: 1
          lrwp: 4
          drtm: dlvs * sphw
          mhfz: 2
          sbsz: 5
          ssqj: 11
          vdtp: 2
          nqnm: pcrd + flbn
          gdll: 6
          zdhf: tnlr * tzdw
          nlnl: 2
          cmzj: 8
          fbnc: 2
          mpqs: dnbs * ldvv
          tqsw: mnvc + qslm
          rdgz: 3
          ssnr: 16
          fjph: pnnd + vmlj
          mbnp: nqhw * mtqd
          bqjm: bhpv + mdnj
          spvh: hghz * mwjg
          zdbb: 2
          fvmw: fgwm - ghcm
          gffg: jpst / fvbd
          vvcb: vpnf + gpbh
          jpvr: 3
          jhbp: mdzs - qdbl
          mflz: 6
          hqvq: 19
          rzcn: mdws * dfnm
          ljmj: 5
          vltp: 7
          zpjn: tnlp * vjpn
          mjlr: 6
          pwpd: 5
          bcfd: jgvs * bsjq
          zvpv: ppws * pznc
          wwzb: 1
          fvmj: bpfq + qqzv
          fjfg: 3
          dnbs: wbbb * rrml
          dnbc: wsvp + brlw
          wsbj: 2
          zczr: 7
          gblr: pjnj * crcf
          vhdt: bnnt * sfsw
          rgdt: 2
          brwr: 2
          rnnc: hmjn * mzmm
          zqhr: 4
          mtqd: 4
          pcqp: 3
          ssdp: trzb + vjjw
          ffqr: jfhn - tqgd
          dcwl: 2
          tdmq: mhqb - lpdc
          ntnn: 2
          mzjb: dzqm + scds
          zwhn: hhlq * ztmj
          bwbj: vwgs * spqp
          sfrc: 1
          qfzj: pbln * tqpp
          rtzj: 5
          qgdp: 3
          zclq: 12
          htgg: hhfs + mbph
          ltlr: 14
          gfnw: nqnw * jsrq
          lwmn: srzs * jnzl
          hmhw: 3
          jwfg: tnws * ltbc
          whhl: 3
          vnbf: 3
          tzlb: cptw + hbtw
          bsjq: nmmt + hjqw
          bzls: glrm + zqwn
          znlc: 7
          jbnq: pnch * lsgw
          twpq: cstc * hcsc
          ppws: tgjd / rrtl
          cmqw: vqlp * svct
          bsjm: tgmt + wcnj
          twnf: 2
          svfm: vdwp * bbtj
          twjg: 2
          tvbz: 14
          phqs: 14
          dwnm: tfmb + bvpj
          lssg: 4
          pmgd: qwns * splv
          rdhb: 13
          hddj: gnsd * pdcn
          hpjn: tpgf + zbzr
          rdzj: 2
          lcff: tbcj * zrbf
          tpnq: 16
          vcgb: vvsp - gtqv
          wgbn: 3
          bdnn: 3
          brfs: 6
          pbdg: dhtd / tppm
          wjww: 3
          thlc: 7
          szvt: 3
          whgg: 17
          fpqf: zprw * vzjs
          fdlb: nmdt - dgpg
          wdsd: csss * hmpd
          zcqm: 11
          zbtg: pcsm + scfj
          spgt: dlzn + ngbr
          tsgq: 6
          nvvc: hhjg + mfbv
          zrrl: 3
          lmnq: sfvn + mddv
          szsn: tnpz * fhhm
          wgjh: 4
          vvlc: 2
          njdf: 3
          hmfn: 3
          nlmn: 4
          fdgq: 11
          jpmw: csbv * blsf
          jlmg: 7
          vpsg: 9
          pngq: 2
          hcct: 2
          mtqb: 5
          srqh: pmdf + rnch
          jjjq: rrln * qcpg
          hfcf: 4
          nrvm: bscn + flpl
          gzqp: 4
          fpfs: cwnl * lljt
          tdcz: mfst + bvmd
          qdsp: 3
          tgtw: pzts * fvmw
          zzqg: glgp * vvmh
          ggqt: tbrb * mtth
          gbpr: rpdm + nftn
          szch: fhjb + qtnt
          jpjd: 2
          dhcd: 2
          trbp: hpjn - mjlr
          wdsw: wvwb + gpww
          mwns: qdqf + pmll
          cvnz: jjqv - tthh
          pbjs: 3
          mfmh: 9
          tpwd: wdnp * hsrv
          gjpp: 2
          htjc: vsfh * gzqp
          nwmq: zznr * qtzf
          hnmp: 8
          npsg: 11
          ldzc: 2
          dmnr: ngff * fbhv
          pnhb: fdqf + jhhv
          psnp: bqvv + nhcl
          pwsc: fvss * sgdl
          ccsc: dmww + vzhw
          rcrl: plqp + fvwc
          zjrn: 1
          lpct: lcql / vzdt
          jbmp: 2
          hnbf: 11
          qddr: njdf * rffc
          ngmp: gtvs + lrnt
          vbhr: bspp * spnr
          vsfh: 2
          tfcn: jcfr + mgzn
          wgdw: 3
          hslf: npsg * nbvd
          jwpr: lpdh * blhg
          zhnf: bqsp * jzfl
          lrqr: jvln * hbrr
          bzjr: lcsl + tlgl
          ldsd: 1
          hsgz: 3
          lhlg: sqqz * fcbl
          hfnf: 7
          ccvp: 2
          fsbv: zlhm * wlcz
          pljw: 10
          nmwj: jhqq * ttjt
          qqzv: 8
          nnjr: 5
          tgbc: 4
          jfsv: qvvc - vztv
          zsvg: jmpl * hmfn
          gtzr: mssq * hgwr
          bcgd: 4
          lstd: 2
          fdfs: 3
          dmvm: 15
          wwqg: dqhl * jfdl
          wmmc: hnnr * wcfw
          nhps: wcfh * hwdd
          hzqb: wlps + csrp
          gwbv: 4
          tpwh: 2
          wnzt: jbjg * mrjb
          mdzs: cwfc * rnhq
          lmgb: jwlr + jldt
          mccl: 4
          fhfm: thlc * hlhs
          bcwb: lhlg - bfsd
          qjlj: hfzr + qcfn
          ddnv: gwrc * hjcd
          dlzn: 3
          pwtd: dqft * zczr
          zbwh: pvsz - zqsj
          hgbp: 2
          znvd: tqrp * tzlb
          cznr: 5
          rdvm: qcht + bdfs
          cptw: hcbg + zgsv
          jlvb: 8
          rlqn: fwcv + ccbs
          dzzj: 2
          nvdv: zclq - nnrm
          lbmg: gbzr + vbfw
          bfzj: 2
          jcmg: qnnc + pgsh
          zldd: gfsw + stgn
          lqjs: zwwc * tpwh
          sjqr: 3
          rwpt: 14
          csss: 7
          nmrp: 5
          cgss: 10
          dvrt: rghw * vmwn
          gbjn: 2
          blhc: 5
          lclj: twpq + whdn
          jwlr: 2
          vvqz: 2
          vzjs: 3
          rfqp: dmbg * rqfj
          qclr: qgdp * qrcg
          jwnw: fszl + mfmh
          pbsh: zdcn * hhjn
          gmqm: 3
          ctsh: 3
          tfmb: czrl + vjjg
          hrlj: rbgz * hhhm
          tlcl: lfnh * jpqp
          hqnv: 3
          lzlg: wzzf * rsrg
          hgwv: 17
          mdqs: 2
          tbcj: 3
          wzwd: 5
          bbhz: 6
          dgsf: nwdg + lsvv
          pcrd: lrdv * rdwb
          vmlj: tsbv * tvzc
          trfr: 4
          cshv: cbpg + wjlt
          rttr: qmrf + clsv
          dtcd: 5
          nhcl: 15
          vcvb: pnwr * jpjd
          mltb: 2
          vfcd: qfpw + bzdt
          lslc: 18
          hvhg: 5
          qqtf: 3
          fvbd: 5
          qspm: 2
          tzvr: 2
          pqzc: psnp + rzvw
          wmnq: qqfr * qnww
          bzlt: 2
          mvcw: 2
          qqvl: 18
          jfsl: 13
          bmgb: szdz + hnjl
          zlcv: rbnw * vbhq
          qqwm: fdfs * bdpn
          bqfs: 14
          qfzs: zdbb * dfsg
          mdsm: prnb * jshb
          dvrs: 2
          vjwh: nvzr + zgjc
          tnlp: 3
          bhph: mspw * mjsm
          ccmn: drjq + bbwd
          hzml: 4
          gzlq: mtwf + gzld
          gjjf: 4
          wrvc: 2
          hlrd: zczc * mnbv
          nnvf: 3
          nvmt: 3
          vfwb: qrsl + wsvz
          crng: gvvb - nzdv
          gtgv: 3
          szhv: szqh + mpns
          mddv: 8
          wcfw: 3
          fzbb: wzdp + rdvm
          mdqz: hlnm + zqps
          tvjl: 2
          gndp: 11
          qshq: 15
          fwgn: nlfj - hfgl
          dhpc: 3
          fltl: dnbc + vdqb
          hbtw: mpbs * dzdm
          lzbd: lbqt + mtpp
          qwgh: 8
          mrfm: dvsh + fwht
          czqq: hppn * tcjf
          nmps: 3
          rgrc: 2
          qszp: frbq * wvnh
          mmhr: 2
          zjgv: jcdr * wcbf
          vbbs: 4
          ljzm: 2
          nqch: bhnz + qdsp
          fvss: 2
          lzbf: gfhb * fjst
          chns: 2
          hrbf: 5
          vwhl: 6
          fgwh: zqhw + twvd
          lhsh: hzpc * wcww
          clln: wljh * zdvl
          lstj: 1
          lcwq: 9
          qzcj: gqms + jvjm
          ngrf: 3
          hlhs: 4
          zwfw: 4
          vqlp: 5
          tvwh: hppq * dgfd
          vthg: 5
          hnpj: 5
          mtpp: 5
          ghtz: msfg + mjgs
          pmrl: 1
          jldt: 9
          nvcj: dtzp * nmps
          lmbg: 9
          rwrt: svhq + vlgq
          hmjn: 3
          qzfp: vsjl * llld
          svzq: 1
          lmdb: hwnd + vrhc
          zntp: nqnf * tlhm
          jwvp: zrhq * lhwj
          wjhp: nscd * ghtz
          qlzb: tqvb * pmdd
          wvsd: lpmb + sblb
          hqts: tjzm + bcfd
          lnvb: 18
          fccl: 3
          ddqj: 2
          gbhn: ljgf * gcct
          pwnh: cqcq + zfcs
          fnnq: mhgp * pjwg
          mrsd: 1
          tnwh: qddm + jqhz
          mdvv: 3
          dzlg: 5
          hzsf: 5
          cfrr: 4
          bzrn: jrql + trbl
          dhrd: hzvn * pcwm
          wvwt: qwhq * zsvp
          pdnz: 3
          gzrj: 3
          hbjb: trht / rght
          jrql: 3
          gbtc: dnwt + phnv
          nlfq: 2
          dpsb: 5
          qddm: 8
          znjb: 3
          dnvq: swdq + bznt
          bqsp: 13
          cqcq: jvjn + szbc
          lpmb: hphf + ccgd
          ljsm: 5
          lvwn: 7
          dlbw: 4
          vrhv: 3
          qmdl: 3
          nflf: mhfz * vtlf
          dnvh: 3
          nfjh: 3
          rrtl: 2
          jfjj: tbrl + dvzh
          ffwj: wczb * sbmc
          ftwc: lvjq + vlvj
          bpvz: vthg + bthg
          bwrq: ljzm * mpsg
          vbhq: 2
          jnvq: brnb * qszp
          rrct: pshh + nrcb
          srqp: 5
          dstn: 4
          zzsp: 2
          lnlr: jrmp * gbvt
          fvvf: 3
          qdzs: 7
          rtfz: vncc + vzfg
          crtt: tnmn * hsgb
          dqdb: glms + gdcs
          ngrc: 15
          vddg: gngg - rnpq
          twcb: vjwh * bpmz
          bjpl: 10
          vrhc: 4
          bjvc: hrsc + tpfw
          ppbd: 2
          lgfr: 5
          hsrv: 3
          sghf: 2
          fjrs: cfqp * qmsp
          swwp: gvvh * htwl
          tvsj: 2
          scqp: 2
          whfl: 5
          tlhm: 2
          nmmt: jgvl + vztb
          hlnm: 7
          rzzl: tcpd + ltjt
          bfzf: 3
          tvfz: 19
          qddl: 10
          fpvd: vwpq + vfbh
          whct: 11
          nljr: scbm / wfmn
          rrln: 3
          pglz: 3
          plgw: 5
          psns: pghw * dtcd
          flwb: 5
          fcpb: 2
          lnwr: mvhf * gwhf
          hjqw: 10
          sldm: 4
          sbmc: nrlf * gwsq
          pczr: 9
          pdwj: 3
          ntrc: 2
          chjz: tsqm + rjqp
          dwtr: 5
          mqjw: lfjm * bjcg
          vlvj: zhss * pwhz
          ggtz: mvrg * sprq
          ndvl: tnfg / cnqt
          zrsl: 5
          fjhg: 3
          lltw: 3
          qhjb: 5
          fbhv: sgws + qmnd
          qrct: 2
          gjhn: 8
          tfqt: 1
          trvr: plsq - pljw
          qdmf: zqhr * zbzq
          hggl: 2
          fbfj: scqp * dgsf
          lgvr: npgv * zqnd
          rqgl: 2
          dsww: wwfg * qgqv
          ssqv: 2
          qbbj: 3
          hmnq: mzzw + njcl
          bzgh: 1
          zpsh: bqfw + vvjm
          pbhb: 6
          fjfh: 5
          tcqg: 2
          lmtg: rptw * rbfm
          fvbh: 5
          thpd: 19
          fsfd: jsws - pnhs
          mjlp: tpnq + pvnm
          mdws: nvls * mcqg
          vhbn: 4
          mwlq: qmzl * dfjg
          hwhb: mflz + ghjc
          swzt: 8
          ptht: fgrc * mhrv
          mfst: 12
          nmhj: grqc * nfsb
          wcnj: sdcd + dlvr
          tvpq: gbrl * bsbq
          qwth: rhpc * bhql
          rfpc: mdsm / fsst
          dvdn: mcfw + tjbp
          zdtb: vcgb / bcnz
          mhjc: 2
          dwff: ngmp * qsls
          tnmg: 2
          vtzq: frrh + qdzs
          bcts: 2
          qdst: grql + nglc
          bvpj: 3
          vlgq: vwhl + nvrg
          cfqp: 3
          nglc: svtq * pgjm
          hcvr: rrjm + dpwl
          flpl: jmsr * jpts
          smqv: 2
          qwjs: jrtg * qnbb
          dttn: rpmf + jwfg
          swct: gvcr / vtrm
          ldzv: 2
          frbq: 2
          zdgh: crng + tfqt
          zwwc: 7
          lzcq: 5
          vncc: 5
          sqqz: jpfm - qldd
          gcrs: 2
          pwsz: ppbd * ctgc
          pjzs: 5
          pfwb: 4
          fvrl: 2
          vdqb: 2
          vmdl: 3
          znbb: hjdr * hlzg
          tqcb: jtcv * wmdh
          qqvv: 4
          zlrg: 2
          svjw: 10
          spsq: fzcl + dnvq
          zlhm: 7
          pdqz: 11
          vhfq: bzmv * rcqw
          bnvf: 4
          mvwm: 3
          njwt: msgc + jthw
          pwhd: hcct * bwbd
          thqr: 2
          wgpj: lclj / fvsj
          qbjl: bmsn + qfpq
          jjbw: 6
          fpfc: 2
          dmbg: qzcc / gznw
          hbrr: 2
          rbnw: 5
          qwns: clhh * jssb
          sfvn: 5
          sprd: qpgp * pmqp
          cffj: 2
          mlmc: qvsl - bzrn
          hlfn: 2
          hdfh: rtsf * tnmg
          plsq: nfgl - ptrj
          qvsl: cpdp / zpvw
          pffv: dnnq - qgjp
          pdmw: 5
          qbfl: 2
          mhvm: vjqh + tjhv
          nbhn: 11
          ptsd: vrqc + wdbp
          vmsz: htqn + hpgl
          rjmw: 6
          pczh: 4
          bmqw: ntrc + qjdq
          qfpw: lhsh - htln
          szqh: jptv * rmhs
          wbgm: 3
          jfvc: 2
          cfcw: lpmh * cqdq
          mrsw: plrw + gffg
          zpvp: 7
          mmvv: shcq * hpfc
          wbrc: 4
          brlp: 2
          wjrr: 1
          ncjh: 10
          ftlq: sjvd / tnvq
          wflw: 5
          hbmj: gnvs * nrbf
          vfjm: hslf - frqf
          splv: 3
          hjgq: bgsq * hcsg
          rhnb: vwct * nzdz
          nrmt: cffj * psfd
          ctgc: 13
          zvvq: 7
          bpjj: lssm - jsbs
          sjnp: 19
          wlvz: 9
          jjqv: hmcd * mvwm
          dbpt: lnpc + jgsp
          dlvs: mwbv + hnlv
          zsrq: 17
          jfqs: ccgf * rfpc
          wpld: 2
          fszg: bjhq + zchh
          blsj: 3
          gmzg: jdqg / vhtf
          crcf: 3
          qbmh: cqrs * nqgd
          tqrp: 3
          scvr: qmfg + lstj
          spdw: 4
          zrqb: 2
          vqhl: 6
          scqd: 5
          dvsh: gmqm * dqpr
          tttt: wjww * mrsw
          rgzw: sbqt * snsr
          jqhz: gbjn * bsrg
          gvhr: rgfb + jfsn
          cmgj: tmpw * rwrt
          root: pgtp + vrvh
          dfjg: cspt + lrqr
          mtbr: 5
          rqfj: 5
          ltvb: fhsl * bpjj
          ccbs: 1
          qqsf: 3
          sdcd: 5
          strl: 5
          cfpt: 2
          nldz: 9
          lpmh: 3
          dnjw: 2
          jzzj: 19
          dppm: 2
          lfnh: fcdr + fvcm
          mdnj: 5
          mhhg: 2
          qfgb: ssnr + tvcm
          trsm: zrhv * nwzr
          svww: brbr * nzfd
          flbn: wbgm * bbnq
          wvnh: pnhd + gljs
          hpjf: lzcq * vcvv
          jfhh: 3
          lmnv: 4
          mzzw: vhnl * gfsm
          chmv: 2
          cqrs: fzbb * pptn
          rfnm: 5
          tnpf: fjmr * dvfs
          qbms: cwhg * ldzv
          rsjw: 14
          tfdp: 5
          brlw: hfbn * gnzz
          rdwb: 9
          qfsn: 4
          lsvv: 10
          fhsd: mgqr * mhms
          zftw: 9
          zdcn: cvjf + cbgw
          tjmr: fzln * csnf
          tsvl: 3
          vjcv: 6
          bgrw: cfpt * qdmf
          bzqb: vqgw * ggjm
          dlwd: pvrl + fnnq
          jshb: 7
          tznt: nmtz + pmcv
          hmmh: 2
          sdfc: 4
          qtqp: 1
          stmb: 8
          hcsg: 14
          flcw: 2
          bcnz: 2
          nnqn: bfzf * bjzc
          tnlm: 4
          zgjc: 1
          tfph: hrlj / fccl
          pmcv: jngf + tzsj
          qngb: 2
          trbj: ndcq * brlp
          mpns: 2
          tzvb: pvnl * stft
          gmhl: 2
          bclr: 5
          ltjq: 2
          qstv: 2
          fhql: 5
          zbll: qvss / bqwr
          vhjd: trms + mwlq
          jmsr: vnww + mqqp
          hhgj: 3
          vjpn: ltjq + mbhg
          zjnn: 5
          mvtt: 3
          rnch: 3
          mrjb: 3
          mwbv: tgqw + sdnb
          rjsp: 1
          gfsm: ptcz * vjvc
          schj: qqvv * mnzh
          ndwc: 13
          hnjl: 2
          ldvp: cgwd + csmn
          dqpr: 3
          bwbd: ffnm + fwcf
          vvsp: vplw / jbgb
          zppq: 2
          vztv: htdg + brzm
          nspv: pvbm / rppq
          sznl: lssg * sjmb
          mmvp: gqgp + jgnh
          djrf: lcmh + fjnp
          bgqd: 2
          vtcr: jscf + bbhz
          mjsm: bwnj * mdnh
          nnmm: svpp + fpsn
          jtrc: tjvr * dbpt
          mqph: vfjm * mccl
          rbff: 3
          vzhw: lddz / chmv
          hqfj: 2
          lsfl: fvdd * pvdg
          tfwm: 10
          vmjq: wzgp * mmrv
          plqp: trsm + sfrc
          wcbf: mwff * jmpm
          vmfv: rbsh - zfjl
          dbtq: mjsv * vqhs
          pnwd: hrdp * vddg
          qltq: 2
          tnmn: ddqj * whhl
          wtfd: 12
          dpfp: 3
          pnhd: rcsp * gjff
          fqgh: 3
          czlv: 19
          ghcm: lzdw + ptsd
          pznc: 4
          cphb: sswd + dlcm
          mqzd: 5
          hcsc: 3
          gfmc: 5
          phfr: pnmm * vtsd
          ggvn: trfr + qlwd
          mvlj: gbfp + hjgq
          trzb: rrhl / lpwp
          zhzt: njwt * lnph
          qtzf: lfml + vdph
          qzhv: tgzc + zvrm
          nsrb: vpgq / mmpt
          vdwp: nsrb + hcsp
          fgtp: lcns + ctww
          zgpg: 1
          bdbc: 2
          tsvz: 5
          pmdd: 2
          qnqf: 18
          vdqm: sshj - dzzj
          lmmc: znsh + sqtt
          vpfp: jjjq / mcmd
          mjsv: 2
          lmbl: 1
          cgvr: 2
          mpdv: 9
          zdlj: 4
          bmlq: bszr * wppd
          qvpc: 1
          hpbd: 3
          rwbr: nlmn * jpcq
          qptv: fwgn + lcsh
          ntjn: hbzs * bwbj
          lzdw: tcvj + mjlm
          ccgd: 2
          bjzc: vvzl + zsrq
          frrh: bbcm * zzww
          tccz: 5
          mwff: 3
          fzhh: 9
          jptt: cmbm * jqpp
          svjf: 8
          bspq: zrqb * cfrr
          pnch: 2
          prwj: nzlr * hbrs
          vwrc: 2
          cbpg: rsnl + dptm
          hfwg: 2
          jjmp: 4
          gwgj: qghb * mvrc
          flwv: ndpj + gcdl
          hvpc: cjmr * srqd
          pzzs: 4
          cpns: 5
          mmdj: 12
          plfq: 6
          bflb: 9
          vfbh: 9
          zqhw: qpvq + mbnp
          hpcf: qbht - vnwt
          lssm: 13
          mcpr: 7
          fvdd: 3
          mjqf: smdd + cgtd
          cgbv: zntp * tflh
          fjst: qmml * jhtl
          bpns: sprd - nmhj
          dzfg: bqcl + pvgw
          wfmn: 2
          svcv: fdlt / tzvr
          fcbl: 3
          mhgp: 3
          lwdn: tdrm + stdc
          hzvn: bnvz * hctw
          zwvm: 3
          pcgt: 2
          jvjm: hpgz * mvjc
          qpwl: 3
          fbdg: jnpq + fvrl
          fbjp: mhvm * sdhm
          qqzm: hjfz / vpsg
          zbtq: svfm / lzpm
          tzmc: crtt + wmnz
          ngcb: 3
          qjlq: swtv * qjlj
          prhj: 2
          lcbs: 4
          nrbf: wtnh + hbhz
          sfrt: 2
          qbzr: rgsf * tsvl
          szdz: 5
          pshh: 8
          sbln: 3
          ftlz: 4
          vzhp: 3
          njjb: 2
          ltjm: gfnw + rdhb
          nzmt: tsgq * nljr
          wbpr: bqbn * mlwd
          bfdp: cgvr * mqff
          tgps: szsn / cgvf
          tzmz: wvsd * nljp
          qrvv: fjfh + bvgl
          fnwh: sgtv * wlvm
          fmth: 5
          trht: dstn + jgvq
          mcnh: 2
          qrqd: 2
          rmhs: 5
          wsvp: 7
          sdsg: qjqr * mnvb
          mzdg: 8
          mjfb: rmps * mrmh
          cbqp: 5
          gcnz: 3
          cdpp: smfp + rrvf
          cbwm: tzmz / gqfn
          dwwv: 3
          bpfq: ngrf * rqhm
          jqqw: 5
          stbh: 3
          tnnf: 9
          mcmd: 3
          smdd: qtjv * qrqd
          bpqt: 3
          lqcs: npdz * qtsn
          zfbj: 11
          trms: qbjl * ftlz
          vpht: 2
          wljh: 5
          qjqr: 2
          nwbr: 11
          lwdq: 12
          rrhl: lwsd + wmcd
          nprh: djqs * zwvs
          grwg: mvlj * mhjc
          ttbb: 2
          mvrc: 7
          wvfd: 14
          mbdg: sltd * fbhd
          tvzc: sznl - hzhd
          hpgz: 3
          bzdt: 2
          phtf: 3
          lqbt: 2
          rbwn: rfnm * vhts
          nrbh: 10
          zhss: hrbh / znhd
          rhhh: qzcj * hnnf
          znrw: 5
          clbg: gbpr * gjmm
          jcdr: 2
          jqbg: 3
          tczb: 2
          vmtm: wwhd * qpjl
          cpdp: rhhh + npmt
          jpcv: 12
          mlgd: lmcd + gjql
          mpbs: 3
          wtlf: 2
          jhdr: gqnz + gwsr
          lzmn: mqjw + qsjq
          vgzm: hjhn * gbtc
          tzsj: 3
          nrcb: wwqg + pjpl
          jsfd: 14
          vhbq: qpcf * nhqt
          hjdr: 2
          lbww: 3
          tjhv: 1
          wcbj: rgqh / nmjc
          chgp: 4
          cbpz: ssdp * rjzt
          gffl: 3
          csmr: 3
          wcww: jcqg / ssqv
          gqnz: gzlq * pzzs
          bcgq: 3
          lqbs: jzwt * fpth
          fqrr: qpqb * vrpw
          pjpl: nfqf + rpjv
          sjmb: 4
          phnv: glbz + mcjj
          mbch: hhnv + mvdm
          wczb: 2
          vgld: ljhz * tpwd
          lgvl: zlrg + nwcc
          fpjt: jfnp * jvrp
          nqzd: 5
          tzzv: mscw + fjcj
          jfhc: 5
          rvfg: 2
          zvpp: cwds + ntvr
          dggf: zdlj * jwjj
          hrqp: 5
          zbjl: prwj + mdbs
          slcp: 13
          jthw: sldt / gbrh
          gvtg: 19
          cpnc: lflb + ndsw
          jdsz: pmgd - sbsq
          pgtp: lzwb * cbfq
          ghqb: 2
          bbcm: 3
          dphr: 11
          bhnz: 4
          dwqn: mpnb + fltg
          ldhj: 3
          dfsg: 3
          gjff: 2
          fwqt: hsgz * zbsw
          vztb: 1
          pdfr: qbbj * nzst
          rbht: bwfl + dhws
          bbtj: 2
          ztwm: vmtm + trdb
          wdsh: lgqj * bzdr
          mbbw: fmzj + cbwm
          cplf: hgjl + fttq
          tpzz: 3
          mvrg: 5
          wlcw: 6
          ffph: dlbb + ccmn
          gpqw: 12
          gmbv: mdqs * qjqf
          qpgp: rwrc - zcgv
          mtrm: 2
          cgfw: 13
          hbhz: gsls / qrvv
          mzmm: 3
          ldgz: fmth * mdqz
          clpb: 9
          ppmz: 2
          fjbw: 2
          pjwg: cjrf / nvmt
          npbc: 2
          bqvv: 12
          ghfz: 5
          pgsh: nrvm + slqb
          lnnn: 3
          jvln: jcvf + tfph
          jgsf: 5
          wnrt: gjhn - gtmj
          rbsh: tszj * mzwb
          gbfp: hdrc * ffph
          rqbt: 1
          zbzr: 3
          mpnb: fzwf * qhjb
          gdhs: 11
          sdhm: tdcz + zdqc
          vnjv: snpb + nbhn
          vszh: dvrs * gnzg
          zllb: 3
          trbl: qrdc - qqwm
          mvcf: 3
          cvpp: plfq * qbms
          dqlb: 10
          zdrs: 11
          lnrf: fwqt * ljbh
          pgmd: 18
          qllh: clpb + gvjm
          gvjm: 3
          cgwd: rdqq + nldz
          fhjb: frcm * vfcd
          nlvj: qsnw * pcrr
          mtth: zsdw + fqtl
          zltv: 1
          twrp: hqvq + jfsl
          hjcd: 2
          hthz: 4
          dmgt: pfnr + hqrz
          nnnj: 1
          lvfh: 2
          qgph: 3
          vjcq: wjbn * vqfh
          fgrz: dzls * bwlz
          lzhv: fmpt + wvwt
          fwwn: 3
          cjct: lnnn * lcwq
          cgtd: bjqq + cgmt
          jrqq: vzhj + htjc
          dgpg: 5
          hddv: 2
          jdqg: cwfl + hlpb
          cgcl: 19
          prgj: mwrs * thpd
          tsqm: ghlh / thqr
          rbzt: tlwl * nmrp
          lhzq: lzhv * zdrs
          bfjp: vbqc + wdsh
          sbsq: cdpp - bqsr
          tqss: 11
          vvzl: 6
          bprf: jhtv + sdmb
          gjtv: nhps + lnlr
          bfsd: schj * dwqn
          zcnv: 18
          pfjv: 5
          hjns: 6
          vwgs: 4
          bpqw: 9
          wvdc: 2
          cvwg: dffj + tvwh
          bvvc: 3
          ccgf: 2
          sgwf: swnj * dnjw
          jvph: nzlp + pnwd
          rqhm: sdtt + bvpl
          vrcs: pbjs * pcsn
          gdcs: twsc * zbjl
          gnhg: 2
          jfnp: 5
          nfcn: scpz + cjsc
          tscs: 13
          fpzc: 2
          gmvd: mphq + vgwl
          wggp: 5
          jssb: 13
          gnqr: 14
          scbm: bmgb * pngq
          srrd: vbbs * lbbj
          sbjj: 7
          htqn: 4
          wtdr: sgcj + sccz
          gsnp: 17
          fzdn: 2
          tbrw: 2
          tqvb: 12
          qlnf: 5
          ttjt: 15
          zgsv: 5
          fjql: vhmn + spsq
          gvvb: ncjh * bnvf
          mjwt: 2
          ltzc: jtrc - tscs
          pvzp: scvr * qlhq
          rhpc: 2
          ltjt: fsjr * clpd
          bhfg: 2
          tcjf: 2
          bnvz: 4
          pmqp: 9
          rgzd: 3
          dptm: bfzj * jprf
          sgdt: ffpm / tdtl
          nnrm: 4
          dwtb: qjfq * zstc
          tjvr: 2
          phln: wvhd + rfmh
          zndv: gvhr - wdsw
          stcr: 7
          npmt: mhhg * rttb
          cfpj: ltwt + zbnd
          slfv: 2
          prnb: 4
          ffpm: mtzv * qrct
          qdqf: dggf + tlcl
          jbcw: dzfg + rgzd
          vpwz: 3
          gtjr: 14
          fgrc: 2
          gnsw: 2
          pzts: vflz - nqwj
          rwgc: 2
          vgjl: 3
          hshl: 3
          pvrl: 2
          bfmp: 19
          rffc: 5
          nbzf: dcbt * htbb
          svld: zblw * qlnf
          qcpg: spgt * hhft
          dspn: 5
          ghlh: mjfb * ltjb
          drlj: jqbg + psns
          htgj: hrdg * wvdc
          dfnm: jfcl * tdzj
          nfts: 13
          zblw: 5
          sbwn: 12
          wmhc: 3
          jjjp: 2
          msgc: wmfz * hzvr
          dnzj: dnhw * ddqz
          jjmv: 2
          ltwt: 5
          sgdl: 3
          tcnc: 2
          zqps: jsfd - mrjn
          ntct: 5
          zhzb: vhnr + fnwh
          ptrj: 1
          fcwg: 9
          jhtl: 7
          ntcs: dpsb + hbcq
          slbv: nwvq * bfmp
          rgfb: vvcb * zlrj
          lpnd: 3
          slzm: dccm + nhdd
          fncr: fsld - nqnm
          fdqf: spvh + mmvp
          rrml: 5
          sprb: jtvt + jfwv
          fhrz: dwnm * vwdd
          zzww: 18
          zjhd: 7
          dbdl: 8
          qzmd: nbfs + gcsp
          qcfn: hfwh + fjph
          cmbm: 2
          dqft: 2
          tqlt: fbjv * sjnp
          tqtg: 2
          qjnl: rrtc - fljs
          thjb: 4
          qrdc: vgrw + gthz
          csqj: 5
          jtzw: 5
          djss: plgw * fdvm
          grcz: jcmg * mlgh
          rzvf: 5
          jsqr: 13
          cwnl: 2
          qsls: hzws + qzdt
          zzsz: cqch * dvjh
          znsh: 9
          blfp: 3
          jptv: 3
          cjlp: 2
          nmdt: crhc * qhnm
          gfql: 5
          gndg: cnfs + vfwm
          gfwh: jqfl * ffvd
          mhrv: jtjl + lgvr
          wzdp: wngq + mvvq
          lcwn: 2
          hwdb: 4
          jlpz: 3
          hfwh: 10
          nlll: 3
          wdnp: vdsc * nvbz
          sdtt: hpgr * zllb
          sltd: 4
          pgqr: pmjh + hvcn
          jbqh: 2
          lrdv: 3
          tftb: 5
          gwsr: rzrp + dvdn
          tcbv: 2
          ghpz: qlzb / vqbn
          vzdt: lqbg / qbdn
          zhpb: 15
          mmrd: zwtc / bfdp
          bprc: zwfp * mvcw
          gbgb: 5
          cstc: 3
          lrnt: 3
          htmc: 7
          zrhq: jpmw + gsrd
          fnmh: 18
          hmpd: 4
          ljhz: dwtb + nrmt
          gbrl: 4
          rvwd: wsbp + rzcn
          zqjm: rrvv + szhj
          mvhf: zrnp - pzwd
          mvjc: 17
          mcfw: hnpj * jsjr
          gnfn: 2
          zznr: 2
          lzpm: 2
          fqtl: 9
          gnsd: vmdl * twfz
          pfnr: 14
          tmzf: 2
          fzhc: 9
          qjmb: mpqs - ddnv
          mnvb: bnsw * ctsd
          mwzm: 3
          vflz: jzfq * hsmn
          hsrl: dsdl / fvqq
          dzls: 4
          ptjb: lrcq + rgzw
          mmrv: czqq / pvth
          cmrp: 14
          tlwl: 2
          lmhd: tjzd + rmtj
          rpdm: prgm * nqzd
          zdpd: 2
          lqtq: vqwm + zfwc
          zmhc: wqgl - mztb
          cgpp: bgpr * fpvd
          sbpl: hbtb * bjgg
          psfl: cnhh * fhvb
          zwnz: cmbp * wqcm
          lrnh: qvmd * prjv
          tsfc: zhzb + bmzm
          bqss: 4
          rgsf: vhth + hbph
          lhqq: 7
          dlvr: tnnf * bdbc
          nfqf: rgdt * dhrw
          vwrj: 1
          hpfc: 4
          rghw: 2
          qbdn: 3
          msrq: 5
          wlcz: 3
          vgwl: sprb + lzbf
          tghj: 13
          lcjp: 10
          tgjd: cgcv + fpqf
          gwrc: tnpf + wwfm
          hlrw: frtm + lqbs
          nlfj: zjfp + fjfg
          hbfw: 5
          wsvr: 11
          grrm: 11
          ccgq: 5
          hzpc: 2
          ffvd: 2
          jpcq: 3
          mntc: fqfv - dmvm
          gtvs: 4
          rqgc: vjcv * nhtc
          nzdz: pmrl + zhzt
          qvmd: bprf + rtfz
          trjq: zqjm - cmqw
          gngg: fdsp * mcpr
          mnmr: 2
          bhql: pctr + qnfn
          srdj: rqgc / vcll
          shbl: pfjv + bzlt
          tbtd: 5
          lvbv: 3
          rwrc: pclg * ldhj
          mgqr: 17
          vzfg: 7
          jzfl: zjrm + vvlc
          wnct: tdvh + bjsc
          lcrn: 11
          fvsj: 2
          tmpw: 2
          nhtc: 6
          bzwg: 5
          rtff: 3
          dswb: 7
          bjhq: lmgb + chgp
          gvzz: qjnl * lnjn
          jrmp: 7
          tqpp: 3
          frtm: jhls * gpzv
          nghz: ndvs + tvvb
          hnlv: ccvz * lcrs
          vwdd: lmtg + jlmp
          zdcf: 2
          qvnl: 2
          vtrm: 2
          ngtb: 3
          gcgq: 2
          clhh: 3
          fgwm: ccsc / wmgt
          vcvv: tdpf + sdcz
          vdph: rwmc + dwzm
          mtwf: mtbr + pgmc
          qmfz: 7
          gjtj: lcwn * jrrz
          qgjp: 3
          nhdd: twrp - tfwm
          tpmj: 10
          djpw: lpzj - qcrq
          vpnf: vwht + swzt
          qldd: vrzm + gblr
          gjqf: vcws * fchd
          wdzw: 1
          gjmd: fqgh * pmvd
          wmwr: tdmq * qjlq
          qnbb: 3
          tbgq: zzgg * rgrc
          wbbb: 5
          ljbn: 5
          bdpn: 12
          zstc: 9
          vsqm: shpv * bgvf
          wqgl: tjzg / ljdz
          cbvq: 2
          lddz: llgh + flwv
          pnwr: wwzb + tjmr
          shpv: vzbq * tcdd
          jrnb: vmsz / wsbj
          mnzh: 2
          lsvc: zzsp * mhdd
          hwfj: 3
          ghjf: 4
          hphf: 5
          llbh: 4
          tpsw: 3
          lpzj: 15
          cvsz: 2
          gznw: 5
          dsgb: 14
          fsst: 2
          fmvq: twcb + rwdd
          zjfp: sbpl + jcnm
          gmzf: fvbh + zwnz
          vzbq: 19
          fbvf: 1
          ndsw: tfcn / tbtd
          clsv: 5
          rmps: dnjc + mbdg
          vplw: brvt - rdfz
          tcvj: nvdv * bmwl
          cwfc: 2
          nqvr: cdfq + drtm
          bhpv: 1
          zfjl: whct + lwdq
          gpnz: 1
          cpzt: 4
          vgqw: tznt - jjbw
          cbjc: vcsw + hqms
          lnld: 3
          rhjm: ggvn * ztlt
          lpdc: wqdh * bdnn
          dtjm: 9
          lszc: tfcz * tftb
          frqf: zvpv / fflm
          lmwg: gwnd * rbhv
          pqhf: 8
          lnph: 2
          wrpb: 3
          gtts: 5
          zrhv: 2
          sjhm: 16
          cspt: wvcm - lszc
          tqmz: vvqz + jjmp
          znhd: 5
          qnzn: 2
          dbrb: lnzb + wrvc
          zrvt: mhst + vmvz
          djqs: 3
          hwzc: lljg + qhdl
          jngf: 14
          sswd: dhsf + zbtq
          fvwc: pfgn / sdfc
          cwdp: 7
          cbfq: wgjm - qwst
          cwzd: hqnv * fbdg
          mnhp: 3
          fdsp: vgfz * qqtf
          wzzf: 2
          vjvc: 2
          crhc: 2
          rwvt: 7
          hffp: 2
          jlrh: mcsj * fsfd
          pmmv: ltzc / gcnz
          lhvw: 3
          hmfw: znjb + svjf
          hdfs: zglw * wsvr
          mccw: 2
          bpsc: qbgs * gfql
          hhgr: fpfc + fsfh
          cfnf: 2
          hfhg: 2
          pcmz: 3
          pvdg: 7
          qjfq: httr - pwpr
          qfrr: 5
          rtsf: lcgb - bpss
          jcnm: qvrp + hpzg
          mqqb: jvgn / stzg
          fszl: 5
          bspp: 2
          zsdw: 1
          lcsh: sfls * dbhp
          rnrf: zzmj * bzlj
          lnbt: 7
          qpzh: lqcq + fnmh
          fhbf: gcgq * rbzt
          bzwv: 2
          tsps: 2
          dzqm: bgbm - hfhg
          hqcq: hmmh * zlff
          mwzh: cvwg + rnrf
          szhj: zgmn * wpqp
          smqp: 4
          glms: tpbb * ftwc
          sjzq: sbrm + smjg
          hhft: 2
          phqv: 1
          rcsp: 6
          ggjm: 2
          vrpw: 5
          jpjg: lrnh + cvpp
          nzst: zlcv + cnrv
          gpns: dttn - hwzc
          dbhp: ssnz * mbbw
          sqtt: 3
          swnj: 5
          trbf: vwjt / ggzs
          fdvm: 11
          pjlz: mpjv * jqzn
          plrw: sqmq + vwrj
          bvpl: fgmw + njhj
          fpsn: ghjf + gtzr
          bwqb: 3
          nwcc: jvtd + rrrl
          jqfl: 4
          nvbz: 5
          dpwl: bpsc * nlwq
          wmnj: qptv + pspj
          mfbv: 7
          vplf: 4
          vpgl: gwns - zrrl
          hpgr: 2
          gtwp: 5
          pcwm: bsqz - hjns
          qqww: mmhr * cchc
          mqtj: 6
          wttr: 6
          wsbp: zhtl * szbw
          czzm: qvzd * lhqq
          rgzg: 2
          ldmf: 19
          wmdh: humn + jmjj
          nrlf: 2
          fwcv: sbln * thcl
          npgv: 4
          pctr: bmlq * pgtz
          tszj: dzct * mvtt
          mwnh: mpnz + rvfg
          lzjz: 2
          tjbp: whfl * tzzv
          mjgs: fmvq + smqp
          vzqg: vmzv + wmwr
          srqd: 5
          htpz: gfwh * phqs
          qpjl: 13
          hppn: pmrp + nmml
          vbmz: 4
          qbgs: 7
          dwzm: vvcc * nnvf
          dvzh: 5
          rrjm: jbcw * stbh
          tgmt: qpwl * htgj
          pgjm: 8
          zdvl: tfmz + nnnj
          cjdf: 8
          cdmp: dlzb / ljbn
          jrrz: 3
          mnzf: mvcf * qngb
          hjfz: znbb - hvpc
          rnpq: sghf + vfld
          fbjv: 3
          hhwr: nbvc * vbmz
          vncg: flcw * hlrw
          thbz: dcmw + hhwr
          twvd: qspm * hmfw
          nljp: 2
          tpgf: dtpm * jlvb
          pjnj: fsbv / lbww
          qnnc: svww * qhzr
          jpfm: jnvq + vnwv
          lmcd: 2
          jhzr: pwpd * hwzf
          hdrc: mnzf + vpgl
          bdfs: zltb * dvsq
          flfn: 5
          dmjh: 2
          ztlt: 2
          jzjm: msrq * hcvr
          tfdj: 8
          ngff: nnzp * hsht
          nwvq: 4
          drrp: bcgd + rvpf
          vmtc: cgpp - grwg
          bsqz: nfsj * sgrv
          sldt: cfnf * nspv
          ljqm: phfr + tfdp
          grbt: wrjt * dvdd
          nbvd: 5
          fjcj: 2
          lnzb: zlhv * qsrc
          dlzb: csqj * qlgr
          zcjc: 1
          fzcl: jrgr * jrqq
          fbhd: 3
          nvrg: 7
          jhhw: dtgf * hhgr
          rfmh: 1
          hmpr: pwhd - dftw
          mpjv: 7
          tjzg: qzmd + rqcv
          jncv: 2
          znls: 2
          wlvm: vmfv * jbdr
          hcqq: 8
          bbwd: wdgn + hthz
          vhmn: pbhb * gpqw
          ttvp: 2
          mrhp: vzqg + grcz
          qlgr: pjlz / zrjc
          hrdp: qhcj + tzvb
          hgjl: bcgp * ffzg
          ddqz: 5
          jcfr: ngtb * gtnc
          zfcs: 1
          scfj: 4
          wwfg: 2
          wcmd: 4
          hctw: 3
          gsrd: ppgg - rjsp
          wgnz: 2
          zccl: hdgb * jbbz
          jgnh: 4
          gjmm: 5
          fblr: cdmp + wjhp
          ggzs: 2
          nrmn: 14
          mljh: 15
          rgqh: ljqm + vltp
          sgrv: 2
          lqlh: 6
          mchd: 9
          hsrb: lgfr + twnf
          dhmt: bpns + lcrn
          pptn: rmbv + hwdb
          zfqd: 2
          qrcg: cpdl + rmdl
          fvsf: 5
          bmwl: wvfd * cbvq
          dzmh: zqlr - jpcv
          rsbn: zbll - lzjz
          cmzc: wttr + wggp
          rptw: hdwh + jjmv
          jbjg: 3
          qzzg: 5
          tvvb: llbh + gsvq
          humn: 2249
          vpvm: 2
          tfmz: cddb - mvps
          qdbl: 4
          mcsj: pdqm * mjqf
          wngq: plfc + vtzq
          rgfj: 2
          nlwq: trbp + szvt
          jsws: 12
          ndpj: zdgh * jwpr
          mqqp: sjhm + ggtz
          cddb: 8
          cpdl: 2
          wbfr: 10
          bbnq: 17
          fchd: 3
          ztfw: 14
          mtlj: vpfp + pgmd
          dvjh: 3
          jnwq: 4
          pcsm: 3
          nzlr: stmb - cmvw
          pmhm: 7
          fvqt: lcjp * crmt
          zlcb: zfmv * fhml
          mjcq: clsh + vnvc
          mqff: 4
          gsgn: 3
          ffzf: bdhn * gmvd
          zzgg: fszg * rtzj
          lljg: jncv * szcl
          rppq: 6
          mdbs: zlcb / dswb
          bmsn: jchb * zvpp
          lghl: 1
          ntws: 2
          tgqw: tqlt + hlvl
          gnzg: czlv * bpnd
          fltg: jpvr * srqh
          bjdj: 5
          gwfh: nrbh * bqss
          jgsz: rdzj * gndp
          fwcf: cjdf * vgjl
          vhmv: gtsh / vwrc
          jjpl: rwpt * bclr
          jdtv: vsqm + cshv
          hsht: 4
          hhhm: drtz - gbgb
          nqnw: lpgd - sctb
          grtb: blfp + ljmn
          bnjv: svjw - svzq
          htbb: tbgq + zdtb
          dvdd: rwgc * mzdg
          mbjf: rrfb + cplf
          wlhj: nghz / vpht
          jsrq: 2
          pclg: 11
          jgvs: vtmw * msqz
          cnbf: 6
          cbgw: bjpl + fhsd
          ddzc: 3
          bdbt: 3
          lbbj: 2
          jgvq: hbfw + pjzs
          pgtz: rqsm * zhnf
          wlps: svcv + bsjm
          sqmq: 16
          vmzv: gmwc * swtb
          lvlh: bcrs / zftw
          mcwb: tczt - cbwf
          nlpd: bfzl * fhbf
          rtrm: chns * sgdt
          hlzg: mhbw + nlvj
          ntfm: 2
          zprw: 5
          bsdv: fvmj + mqjq
          fgfw: 3
          bzmv: vpvz - wdzw
          wmfz: 15
          qtjv: lmbl + vnjs
          fzzf: cgfw - tbrw
          rrfb: wrgv * bflb
          nzlp: lqbt * vmtc
          vmwn: rcbh * strl
          stqr: mtrm * bjvc
          nscd: hddz * slcp
          zlrj: qqvl * qmdl
          rsrg: 5
          swdq: tgps * psfl
          zjgj: mqrh * lcsb
          vcsw: 4
          njmg: mjfn * mmjc
          lmvd: dvtp * ddcs
          vfwm: 1
          mhms: 2
          tcdd: 2
          ztmj: 2
          jprf: hsrb * tsvz
          bgvf: 5
          tdzj: 2
          pzlj: wcld - htzp
          nwzr: 8
          dhsf: wpsw * vnjv
          qclq: 1
          svct: 5
          hwzf: 5
          vvvg: fnlq + fprh
          rjhz: 3
          fppw: sfnm * bprc
          vtsd: 7
          tnlr: 3
          glvj: pgll + prgj
          jfsn: vszt * mzjb
          bssm: 5
          twdc: 6
          dhrw: 3
          lzdr: 3
          fwct: qfgb * ppmz
          pnmm: 2
          bznt: mwzm * pvzp
          mpsg: dhmt - tvpq
          hlvl: zdcf * blhc
          rlsw: 4
          mscb: hcqq + zfbj
          rght: 2
          lnpc: 5
          plhp: 2
          tjzd: 10
          czrl: 1
          cchc: 3
          ldvv: 3
          sfvp: 7
          glrm: hqfj * wnct
          ghjc: 7
          bvgl: 2
          dcmw: rlqn + qqhh
          vbqc: bzfp * qjmb
          bsrg: 4
          mtzv: jrpn * fcpb
          dtzz: vfwb - jcph
          zqrj: lcbs * wpld
          nqgd: 2
          pmll: wcbj * vbqh
          tvlm: 2
          jcsj: mltb * ptfb
          tdtl: 4
          vjqh: wmhc * tmzf
          rdfz: rzzl + shqt
          wpcs: qstv + ggqt
          jsch: srvd + djrf
          cmvw: 2
          mdcv: djgt + wbpr
          fhhm: 2
          bfjb: jfdp - scqd
          cdfq: rhjm - nrlv
          gwsq: dhsd * rgzg
          cwds: 8
          vrwq: 2
          vqwm: 13
          sznf: zwhn + pczh
          jwjj: qjzt * tcnc
          lglt: 6
          rcqw: 3
          lhhl: zcjc + ntdt
          sgws: 13
          zqwn: 1
          gljs: wbfr + zgpg
          rfvh: fwwn * fltl
          hqms: 2
          pqcj: 12
          jgvl: 12
          cfsc: 3
          czml: qbmh + vgld
          wppd: ffhc + lwhs
          wllq: cpzt * fhdr
          mgzn: zbwh - zpwc
          shhz: pmhm * rbzz
          cgvf: 2
          fhml: cmpr + vpwz
          rbfm: 4
          ffhc: fgtp + gwfh
          grqc: bspq + zwvm
          mdnh: 7
          hjhn: 2
          hbtb: 19
          pmvd: 7
          qdqr: 5
          stdc: 18
          njgr: btbn + grtb
          lfhr: 3
          shfb: 3
          pgmc: tvgl * rjhz
          zcwm: qdqr * jhhw
          bjgg: 4
          qnww: 2
          mnwr: 10
          mnbv: wsdr + tqss
          djgt: bzgh + lslc
          rzqw: 4
          drtz: ghqb * cmzj
          zdqc: znvd + cvnz
          psts: 4
          ljmn: 5
          cvqq: dfqb * vdtp
          ggcc: mjcq / cmzc
          wgjm: qwth * czml
          wdbp: vhpz * lsvc
          bqbn: hmpt * hjjv
          vfcv: ggff * rqdn
          jhls: 4
          pfgn: bcsn + mtlj
          vgrs: lltw + dsww
          vjjw: vzhd + hqts
          fzfv: qzzg * qmfz
          dnjg: brfs + lrbl
          sdmb: 2
          rbgz: 3
          bzdr: rjfl * snhs
          mrmh: 2
          sctb: 3
          bvmd: tvfz + nzmt
          mhst: 2
          wzgp: 2
          hsww: 4
          pmrb: nmwj + jnns
          jrgr: 3
          ffpl: rbht * pdwj
          bszr: hgjb + vszh
          thlj: 10
          gvvh: 4
          rqcv: vhjd + cgnh
          mgbt: 2
          pvsz: nrpw + vfqs
          tzdw: 2
          grdl: jqqw * hpcf
          htwl: bmqm + wlcw
          hsfj: 13
          vcll: 2
          lfml: hrbf * vfcv
          hwfz: 6
          jqbl: 1
          bqlt: gpfl + flpf
          hrdg: dbtl + zpvp
          pqvt: lvnt + mdcv
          vwjt: tctw * hlqj
          mmjc: 7
          dlcm: dqng + shrq
          ctsd: 2
          spbr: mqqb + vncg
          llgh: mlmc * dmjh
          sbfl: 3
          bqfw: 10
          lcmh: hvbs + mlgd
          fspd: wflw + dppm
          bqcl: rhpg * rngv
          pspj: lzjq / nlll
          sbwr: 2
          qvgc: zrdh * mzbg
          bgsq: 2
          jzwt: 3
          mhbw: wlcl / sgwf
          wclf: rflv + ttlp
          vlft: 10
          qjsl: 5
          mzwr: gmzg * tvjl
          pcrr: tnwh + qclq
          qvzn: 2
          jcjd: vqhl * hvhg
          vfqs: rwbr * spdw
          pdcn: 2
          hpzg: jjpl + wrzq
          mqsl: 2
          srzs: plhp + pwzw
          nqnf: 4
          rhpg: 2
          lrcq: gcrs * fqlg
          vzhj: 2
          dgfd: hwsb - mntc
          vjrn: 5
          wfwc: 2
          tgzc: bssm * jhbl
          nzdv: 9
          pdmj: vszs * ffqr
          zbnd: 3
          hdfg: jrjb + zjrn
          wvhd: psts + mpjw
          cngd: 3
          hmzn: ztzf + rrct
          zdfd: rnnc + fqht
          ptgw: cwzd / pzhq
          tdvh: 2
          vsjl: 2
          mspw: 2
          wdgn: 2
          wlcl: tgtw - bzjr
          zdmr: nnqn + lwlb
          tjzq: 4
          jbdr: 3
          cnfs: lglt * pmvp
          wrsz: lzlg + sdsg
          lcgb: dcbg * gmhl
          mhqb: mnwr * vhdt
          tsbv: fjbw * lnld
          wzdf: qgwb * jgsf
          vvmh: cgbv - vhbn
          jfdl: 2
          dsdl: sfvp * jbqh
          tnpz: sbjj + vgqw
          spnr: 4
          bmzm: gsgm + jvph
          hhnv: bpvz * fspd
          fvmf: cwdp * tpcm
          lpdh: 2
          dnhw: 2
          rbzz: 5
          nnzp: 8
          qvrp: nprh + nsbj
          zwlh: 2
          pzhq: 2
          wzrp: ggcc - bwrq
          jrtg: tndm + dwtw
          nfsj: ctps + qvpc
          csnf: zjhd * ftdp
          djhd: ptgw - qnzn
          vvjm: 1
          dbgh: 2
          qjdq: vmvt * jlhj
          lzjq: tllp + zwnc
          nmtz: vnbf + tfdj
          qpqb: ntct * hdfg
          mlch: vmjq + fhrz
          szbc: csmr * nfsf
          ltwp: dphr + dvrt
          nfsb: 2
          qsnw: 17
          qwhq: pqzc + hqdg
          rjzt: 2
          lnjn: 5
          mwrs: qqzm + sjzq
          qvzd: 3
          vqgw: hnbf * lvfh
          zltb: 5
          vwht: czvs * cjjl
          blww: 2
          hmpt: 4
          rdqq: tjfn * mjwt
          qhzr: 4
          zhtl: dlwd * dpfp
          brvt: vrwq * tzmc
          hddd: rjjn + lnwr
          bmht: 5
          ctps: zwlh * wwfz
          qlwd: 3
          zwrq: 5
          bbpq: jwvp - htpz
          qsjq: nvcj * thjr
          rsbq: lvlh - rfqp
          gsls: jhfd * bmmm
          bngm: bpqw * hrqp
          tqpv: 2
          fnlq: 4
          wwhd: 2
          gnzz: 2
          tqgd: mqtj * zsvg
          glgp: mlch * mnmr
          pvth: 2
          jtvt: 8
          pncj: gmbv * brwr
          jqpp: mtdb + fzhh
          pzwd: 4
          tndm: fttt + fwct
          dprd: pwdj * qvzn
          ggff: 3
          zhmq: 2
          dftw: thjb * qwgh
          snsr: 14
          gbrh: 2
          wqcm: 2
          lljt: vgzm / zcbf
          ffzg: 2
          qmsp: 11
          ffgj: 19
          gwns: 14
          bgpr: rhnb + hmht
          hhjg: 16
          hlqj: 2
          csrp: jzcn * zpjn
          bzlj: 5
          hcsp: npbc * dtzz
          vwpp: 3
          hbpg: wlqg * mwnh
          dqhl: 14
          cvjf: shfb + sgrh
          cwhg: 3
          svhq: glzt * rzqw
          qccb: 3
          htfq: tqsw - mvgz
          fflm: 5
          gtnc: bzls + hmzn
          qdtg: 3
          lwqm: 3
          vjjg: dnzj - gzrj
          ddst: cfcv * frpq
          hlpb: 4
          hvcn: cjct + ntjn
          swtv: dnzw * qjsl
          vcws: zrtz + cpns
          jpst: vnbq * lhvw
          hmcd: rbff * grrm
          psfd: rwvt + swrb
          llld: jhdr + ptht
          zczc: 2
          hjjv: 2
          hzhd: 5
          gzlp: gvtg - jcsj
          gdhf: 2
          hdwh: 5
          zlhv: mctw + mljh
          lhwj: 3
          bgbm: 8
          sgtv: 7
          jcvf: hwfj * tnlm
          tpfw: 2
          wvwb: ljbg + tttt
          qmzl: 5
          jtjl: gnvb + swwp
          jfhn: mwhz / pmmv
          wmnz: spbr * ldgz
          thqp: 3
          dwtw: fpjt + jzvg
          cvvc: wgpj * gnhg
          btbn: 7
          przp: 5
          ntgh: wlvz * zfqd
          dqng: zccl + lbcv
          qslm: 18
          npcs: wfwc * tqmt
          fgmw: 3
          nnhh: 3
          qpcf: 4
          srvd: qzfp * sblh
          jbgb: flwb + fpzc
          nqwj: 4
          qqfr: lhhl * pcmz
          njcl: gtgv * qwjs
          vgrw: djss * ttps
          bjcg: pvfp / gdhf
          rttb: nbzf - gjdh
          zlff: 3
          rvhr: zgrs * dspn
          cqdq: 2
          vhnr: lzbd * tqpv
          fqht: qqhm + bwdw
          vqhs: 9
          sbrm: nqvr + tpmj
          wrjt: 4
          tbrb: 2
          nrlv: 1
          trzt: jdsz * vwdn
          hfdz: qwzq * fngp
          bjjz: 3
          dtpm: 2
          qcrq: 2
          shcq: 2
          rjhs: 3
          zjzd: 2
          lpgd: lmhd / pbpd
          lddw: 11
          ggdn: tmft + zdhf
          mlgh: 10
          qjzt: 5
          jzfq: 3
          hgwr: 3
          cjrf: pdnz * pbdg
          zwtc: fssq * twsv
          cmpr: 4
          bmmm: 2
          wvrz: vgrs + wmnq
          dvsq: 10
          cnrv: 7
          glbz: 6
          stzg: dgfl * bhrj
          mpjw: 2
          zfmv: vhtv / lbqb
          rpfl: hfgj - cpnc
          pnnd: 2
          hhws: fhql * phln
          vdsb: vcvb * sszn
          tvgl: 7
          gtmj: 1
          fsld: trjq * dwtr
          wgmn: bnjv - fcmc
          grpw: bzwg + hffp
          bcrs: ffzf + cbpz
          gmwc: wjqn + ldmf
          dzdm: 3
          sfsw: fvsf * mqzd
          zbsw: 19
          bcqv: lbmg + tgsv
          lcql: tfzq * ffpl
          rrvv: hsrl * grpw
          jfwv: 2
          jvrp: 4
          tthh: 18
          dcbg: hzml + wrpb
          tsnl: 7
          wzgg: 2
          shrq: vvzh + szch
          jcph: hdfs * nfcn
          bnsw: vvvg + whgg
          vwct: 2
          hfzr: pwtd + hhws
          smts: 2
          fcdr: jlmg * ntpz
          qhdl: bvsf + zrvt
          hrbh: rfvh + rtrm
          lqbg: dnjg * wgdw
          rnhq: 6
          rpjv: 7
          vrqc: tqmz + bqlt
          jsjr: bfjb + ttbb
          cbwf: dwff * pdqz
          fqlg: 5
          mvdm: sznf + qccb
          ntvr: 9
          dqvn: 5
          jpts: 19
          smjg: bmht * ljww
          pgcc: 3
          sjqf: tghj + mfmf
          twfz: wlrf + trbj
          zbzq: 2
          drjq: 5
          prgm: 5
          gtff: wtfd + gsnp
          zfwc: 4
          vnwv: wdsd * lmdb
          trdb: rlsw * bfrr
          rqsm: cntv + mwwv
          jhbl: 5
          snjn: ztwm + zcwm
          dfqb: qddr - vpvm
          mwjg: 2
          jchb: 2
          cgcv: pdgj * gwcs
          qqhh: lzrz * mmdj
          mqrh: 5
          zwfp: 3
          rwdd: bmqw + ghfz
          jfrq: 3
          bfzl: 5
          gpzv: mmvv + pzlj
          jtcv: cdpv + jhbp
          dnzw: 2
          lcsb: 3
          gwhf: 2
          gthz: qwtd * drrp
          pmvp: gjmd / mlmh
          zvrm: 19
          zpwc: 16
          wvcm: dbrb * mqpb
          gpww: jfqs - vrcs
          ljdz: 7
          tnfg: pdmj + fjql
          hwdd: 17
          lnfh: mtqb + hgbp
          blsf: 4
          qbwz: cphb + tsfc
          djvd: gjqf + znrw
          gbsh: ntws * gnqr
          ptcz: qclr / tpsw
          jfwl: zdpd * bwqb
          bnnt: 2
          zrnp: 15
          nmml: hwhb * lrwp
          vzgn: wpbt * hlfn
          htln: 9
          vdsc: 5
          qwtd: wcmd + jfwl
          qjqf: 3
          vhth: 5
          qvss: qqww * qdtg
          lqcq: 5
          vnbq: 10
          mwwv: fcmh + lstd
          wrgv: ljmc + sldm
          rqdn: 2
          fhvb: 2
          gdwh: zwrq + bgqd
          jbbz: rjmw + mjlp
          sshj: gsgn * bcgq
          pdgj: 3
          slqb: dfww * pnhb
          qrsl: mnhp * jdtv
          qhcj: hbpg / jfvc
          rrrl: 4
          pqrl: gbmq + nvth
          tqmt: hlrd / gnsw
          gnvb: 3
          lwsd: rpfl + ltvb
          rbhv: 3
          fpth: lmmc + zvvq
          jzcn: 4
          dvfs: 2
          wwfz: 5
          ntpz: 4
          dnjc: 1
          vmvz: lfhr * mdvv
          vszs: rsjw / llzf
          dlbb: rdgz * qbfl
          bsbq: 12
          svtq: gzlp * mcnh
          bpmz: 2
          rbcd: djvd + wrsz
          rvrv: hczz + vhfq
          rwmc: 2
          lvnt: 14
          gpfl: 4
          dnnq: tcqg * cznr
          tnvq: 2
          gwcs: 5
          crmt: jnwq + lmwg
          thcl: 2
          pmjh: 2
          qsrl: 16
          cfqs: drlj * jrnb
          qvvc: dfzs + rpzd
          vnwt: ltlr - spth
          pwzw: mqvf * hmhw
          sphw: 2
          zgmn: 7
          bthg: 2
          shqt: ngrc * lgvl
          tczt: fjhg * rsbq
          dbtl: 1
          wtnh: 1
          tfcz: 5
          chbr: hmpr + vzgn
          bpss: 1
          wsvz: bcwb + jzjm
          jsbs: 1
          sprq: 2
          whcz: 5
          hrsc: 5
          wjlt: hqcq * pznd
          jhfd: rzvf * stcr
          jnns: lghl + sbwn
          cjjl: 3
          jgsp: 18
          vmvt: 10
          vrvh: pbsh * bfjp
          lcns: 2
          pwhz: 2
          mcqg: 3
          ljww: zwfw * ldjq
          bwfl: 5
          nvls: 3
          brbr: jsch - zndv
          pwpr: 4
          qgwb: 5
          pbln: 2
          cqrl: phtf * trbf
          htnl: 7
          gfmp: 9
          hbzs: 2
          vnjs: ghpz / mccw
          hfgj: zmhc * nrmn
          lwhs: dqvn * qddl
          fpws: ljsm * zhpb
          ntdt: gwtg + wgbn
          vbfw: jpjg + chbr
          jnpq: 4
          ljbh: 16
          hqlf: 16
          dfzs: jlpz * zjnn
          crfg: 4
          rrpg: 2
          zvjn: 2
          hgjb: vhbq + jmgq
          jmjj: gjpp * mbjf
          lwlb: 2
          ppgh: 13
          vbjv: 3
          vhtf: 2
          dmww: pgcc * rqlq
          svpp: vwpp * ntfm
          qsrc: 3
          qghb: 17
          vfld: cvvc + jbhh
          wqdh: 13
          fhsl: dwwv * sbsz
          qzcc: drbs + jrlg
          slrq: fbfj * qvnl
          hvvb: 7
          mqjq: zbtg * zjgv
          hnnr: 3
          dhws: 2
          rjfl: vfqq - hpjf
          zgcc: mtdl + nlpd
          rrtc: fjrs - vbhr
          vvcc: 3
          rhdw: 3
          httr: qqsf * vlrv
          scds: lnfh + crfg
          swtb: zgcc + dmnr
          snpb: jtzw * bqjm
          hpgl: rhdh * nwbr
          whdn: 5
          pgll: rtff * lwdn
          lpwp: 2
          rjjn: rsbn * blsj
          cgnh: rhdw * shhz
          vnww: fpws + pwsz
          fvcm: cgss * vbjv
          vvzh: wclf * hfnf
          nftn: mqsl * bbpq
          qfpq: lvbv * lcff
          fvqq: 2
          dwzg: dmgt + lddw
          frpq: 2
          nzfd: 3
          hdgb: dbtq + ftlq
          gbzr: lnrf / tpzz
          sdnb: dzlg * pqtp
          lzpj: ffwj - rqbt
          plfc: cdbt + zjgj
          mlmh: 3
          dhtd: szhv + qbzr
          brnb: 11
          bscn: rvwd + jzqb
          sdcz: gffl * srqp
          bwnj: 3
          tpbb: 2
          thjr: hmnq * znls
          hvbs: ztfw + fgrz
          jhqq: 2
          rqlq: lnbt * grhd
          cwfl: qffv * ttvp
          lrbl: 2
          mhdd: 3
          wcld: dhcd * lmnq
          nhqt: 4
          lpmc: qsrl * hsww
          fgvt: 2
          tcdz: 5
          gfsw: qtqp + flfn
          tllp: mwzh + slbv
          qhnm: 11
          mjlm: pcgt * djhd
          nqhw: 2
          rflv: pqrl + hbjb
          zmdd: bqfs + ssqj
          tpvb: 3
          jscf: blbt / njjb
          lzwb: 5
          jvgn: wzrp + dqdb
          nwdg: 3
          hwsb: lqjs * vlft
          qzdt: 6
          hfbn: 5
          pnhs: 4
          rpmf: rvrv * bjjz
          qlhq: 11
          njlf: 2
          ldjq: 4
          jvtd: zlqh - tsps
          hqdg: bzqb / jjjp
          ccvz: 6
          qjwf: cfsc * jzzj
          cfcv: 7
          czvs: 5
          jcqg: crbw * cgcl
          fzln: 2
          sstq: 16
          gqfn: 2
          zrtz: tjzq * tvlm
          lvjq: zjzd * ffgj
          lzrz: 3
          mnth: rrpg * ndwc
          ltbc: zvjn + qfzj
          csmn: gtjr * blww
          vlzq: 3
          gsgm: hggl * lhzq
          tlgl: ccvp * fgwh
          gsws: pczr + dlbw
          pvgw: 2
          ttps: 2
          cjmr: snjn / hvvb
          rpzd: wzwd + wgmn
          rzvw: 10
          wsdr: htgg * tgbc
          mrjn: 4
          hppq: 2
          jrjb: 6
          pmrp: lvwn * trvr
          vqnd: 3
          mbph: 12
          zsct: pglz * dtjm
          gjql: cbjc + jhzr
          vlrv: 5
          lsgw: lpnd * hpbd
          gtsh: bzwv * sjqf
          jlmp: 1
          pbpd: 2
          gbmq: 5
          dzct: 3
          spqp: 4
          lflb: zpsh * wvrz
          zbnf: gjtv + dhrd
          nsbj: bhph - djpw
          pwdj: hshl * zppq
          rthw: 5
          flpf: wpcs + gtts
          grhd: qjwf / bchq
          ddcs: 2
          tgsv: nfts * qnqf
          dtzp: 3
          snhs: 3
          twsc: 3
          wpqp: ldzc + snff
          qbht: wtlf + mbch
          nmjc: 2
          gcdl: smts * pqvt
          mzwb: vlzq + gdhs
          qtnt: fvqt - vhmv
          csmf: bdbt * vzhp
          mcjj: zltv + pwsc
          vhnl: whcz * jwnw
          frcm: 3
          msqz: 4
          blhg: lwhf + mrsd
          snff: wjrr + pqhf
          mjfn: 11
          gmnh: 3
          ndvs: cbqp * dldm
          pznd: 5
          pmdf: 8
          hwnd: 3
          zrdh: jptt / dcwl
          zglw: 2
          nvzr: vrhv * gnfn
          dldm: 5
          npdz: tcbv * nfjh
          wpsw: nvvc * qfrr
          zcbf: 2
          dfww: 5
          mwhz: tqcb - fvmf
          zpvw: 2
          pcsn: 3
          zrjc: phqv + twdc
          nvth: gwbv + wbmz
          pftb: lpmc + jfsv
          brzm: 5
          hfgl: jgsz + pdmw
          vgfz: 3
          dvtp: 3
          nrpw: dzlq + nwmq
          vszt: ncqs * gtwp
          ljgf: 2
          jfdp: 20
          tmft: 1
          scpz: brvd * pcqp
          tppm: 2
          gbvt: jqbl + plzf
          gwtg: 3
          fcmc: 3
          lhcg: bvvc * pftb
          zqsj: fdlb - gfmc
          jnzl: lqlh + lqtq
          hczz: pqqc + vdsb
          gqms: vjcq + bgrw
          sblb: 15
          qwst: tlvg / fgvt
          vqbn: 2
          wpbt: frnt + pncj
          nbvc: 7
          zzmj: qltq * ppgh
          msfg: jcjd + bpqt
          dgfl: 5
          bdhn: 13
          gtqv: gtff * zsct
          fsfh: 5
          hhlq: 3
          rvpf: 2
          jfcl: jbnq + gmzf
          cjsc: wgjh + fgfw
          ctww: slrq + shbl
          mqvf: 3
          fdlt: qfzs * tvbz
          zchh: ggdn + slzm
          gszq: 4
          cntv: 18
          qqhm: dhpc * wbrc
          gnvs: 2
          vbqh: fpfs / njlf
          tnws: thlj + fzhc
          gqgp: fcwg + njmg
          jhhv: fppw * ntgh
          vhpz: cmht * nvbq
          drbs: rgfj * ltwp
          ncqs: cnbf + lmnv
          svtn: przp * zrsl
          smfp: qgph * zldd
          fwht: 2
          nfgl: vqnd * ddst
          qmrf: thqp + fzfv
          bchq: 3
          ltjb: 3
          jqzn: dzld - trzt
          swrb: 14
          jhtv: hdfh + nnhh
          tfzq: 8
          mztb: jlrh + qdst
          ntlr: hddd * gdll
          rsnl: qzhv + zmdd
          hddz: 2
          jlhj: 2
          ljbg: hzqb + nflf
          vwpq: 4
          qwzq: 11
          mmpt: 7
          ttlp: fzdn * cvqq
          fsjr: 5
          sgrh: 6
          tvcm: 3
          swtj: hgwv + qllh
          ppgg: hwfz * gdwh
          hmht: zbnf + phqc
          hbph: 2
          bmqm: hsfj * tqtg
          vpjf: 2
          stgn: 5
          mfmf: 16
          lgqj: fbjp * sbwr
          szcs: dwzg + grdl
          rjqp: 11
          cdbt: 16
          csbv: dbdl + lsfl
          lwhf: 10
          zjrm: mchd * gmnh
          bqsr: srdj / tcvn
          cmbp: 7
          tctw: 13
          tdpf: vplf * smqv
          rmtj: lpct - gpnz
          mvvq: tvsj * gwgj
          wjbn: 2
          fttt: 10
          gvcr: htnl * dbgh
          vtmw: 4
          mtdb: 14
          bjsc: 6
          njhj: 4
          bwlz: 10
          plzf: 6
          lcsl: tsnl * rcrl
          fssq: 2
          jpqp: 3
          rzrp: swct * ptjb
          rmbv: mnth / wzgg
          qpvq: 17
          vpgq: pffv * fblr
          wlqg: 2
          lbqb: 2
          rrvf: 4""";

  public static void main(String[] args) {
    System.out.println(Day21Solver.solveTask1(INPUT));
    System.out.println(Day21Solver.solveTask2(INPUT));
  }
}
