package org.opencb.biodata.models.variant.CADD;

import java.util.List;

/**
 * Created by antonior on 5/22/14.
 */
public class Cadd {

    /***
     Alternate Allele
     ***/
    private String allele;

    /***
     Reference Allele
     ***/
    private String reference;

    /***
     Chromosome
     ***/
    private String chr;

    /***
     Variant position
     ***/
    private Integer pos;

    /***
     Maximum ENCODE expression value
     ***/
    private Float EncExp;

    /***
     Maximum ENCODE H3K27 acetylation level
     ***/
    private Float EncH3K27Ac;

    /***
     Maximum ENCODE H3K4 methylation level
     ***/
    private Float EncH3K4Me1;

    /***
     Maximum ENCODE H3K4 trimethylation level
     ***/
    private Float EncH3K4Me3;


    /***
     Maximum of ENCODE Nucelosome position track score
     ***/
    private Float EncNucleo;

    /***
     ENCODE open chromatin code
     ***/
    private Integer EncOCC;

    /***
     ENCODE combined p-Value (PHRED-scale) of Faire, Dnase,polII, CTCF, Myc evidence for open chromatin
     ***/
    private Float EncOCCombPVal;

    /***
     p-Value (PHRED-scale) of Dnase evidence for open chromatin
     ***/
    private Float EncOCDNasePVal;

    /***
     p-Value (PHRED-scale) of Faire evidence for open chromatin
     ***/
    private Float EncOCFairePVal;

    /***
     p-Value (PHRED-scale) of polII evidence for open chromatin
     ***/
    private Float EncOCpolIIPVal;


    /***
     p-Value (PHRED-scale) of CTCF evidence for open chromatin
     ***/
    private Float EncOCctcfPVal;


    /***
     p-Value (PHRED-scale) of Myc evidence for open chromatin
     ***/
    private Float EncOCmycPVal;


    /***
     Peak signal for Dnase evidence of open chromatin
     ***/
    private Float EncOCDNaseSig;


    /***
     Peak signal for Faire evidence of open chromatin
     ***/
    private Float EncOCFaireSig;

    /***
     Peak signal for polII evidence of open chromatin
     ***/
    private Float EncOCpolIISig;


    /***
     Peak signal for CTCF evidence of open chromatin
     ***/
    private Float EncOCctcfSig;

    /***
     Peak signal for Myc evidence of open chromatin
     ***/
    private Float EncOCmycSig;


    /***
     List of pvalues, phred and genomicFeature
     ***/
    private List <CaddValues> valuesCadd;

    public Cadd(String allele, String reference, String chr, Integer pos, Float encExp, Float encH3K27Ac, Float encH3K4Me1, Float encH3K4Me3, Float encNucleo, Integer encOCC, Float encOCCombPVal, Float encOCDNasePVal, Float encOCFairePVal, Float encOCpolIIPVal, Float encOCctcfPVal, Float encOCmycPVal, Float encOCDNaseSig, Float encOCFaireSig, Float encOCpolIISig, Float encOCctcfSig, Float encOCmycSig, List<CaddValues> valuesCadd) {
        this.allele = allele;
        this.reference = reference;
        this.chr = chr;
        this.pos = pos;
        this.EncExp = encExp;
        this.EncH3K27Ac = encH3K27Ac;
        this.EncH3K4Me1 = encH3K4Me1;
        this.EncH3K4Me3 = encH3K4Me3;
        this.EncNucleo = encNucleo;
        this.EncOCC = encOCC;
        this.EncOCCombPVal = encOCCombPVal;
        this.EncOCDNasePVal = encOCDNasePVal;
        this.EncOCFairePVal = encOCFairePVal;
        this.EncOCpolIIPVal = encOCpolIIPVal;
        this.EncOCctcfPVal = encOCctcfPVal;
        this.EncOCmycPVal = encOCmycPVal;
        this.EncOCDNaseSig = encOCDNaseSig;
        this.EncOCFaireSig = encOCFaireSig;
        this.EncOCpolIISig = encOCpolIISig;
        this.EncOCctcfSig = encOCctcfSig;
        this.EncOCmycSig = encOCmycSig;
        this.valuesCadd = valuesCadd;
    }

    public Cadd() { }


    public String getAllele() {
        return allele;
    }

    public void setAllele(String allele) {
        this.allele = allele;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public Float getEncExp() {
        return EncExp;
    }

    public void setEncExp(Float encExp) {
        EncExp = encExp;
    }

    public Float getEncH3K27Ac() {
        return EncH3K27Ac;
    }

    public void setEncH3K27Ac(Float encH3K27Ac) {
        EncH3K27Ac = encH3K27Ac;
    }

    public Float getEncH3K4Me1() {
        return EncH3K4Me1;
    }

    public void setEncH3K4Me1(Float encH3K4Me1) {
        EncH3K4Me1 = encH3K4Me1;
    }

    public Float getEncH3K4Me3() {
        return EncH3K4Me3;
    }

    public void setEncH3K4Me3(Float encH3K4Me3) {
        EncH3K4Me3 = encH3K4Me3;
    }

    public Float getEncNucleo() {
        return EncNucleo;
    }

    public void setEncNucleo(Float encNucleo) {
        EncNucleo = encNucleo;
    }

    public Integer getEncOCC() {
        return EncOCC;
    }

    public void setEncOCC(Integer encOCC) {
        EncOCC = encOCC;
    }

    public Float getEncOCCombPVal() {
        return EncOCCombPVal;
    }

    public void setEncOCCombPVal(Float encOCCombPVal) {
        EncOCCombPVal = encOCCombPVal;
    }

    public Float getEncOCDNasePVal() {
        return EncOCDNasePVal;
    }

    public void setEncOCDNasePVal(Float encOCDNasePVal) {
        EncOCDNasePVal = encOCDNasePVal;
    }

    public Float getEncOCFairePVal() {
        return EncOCFairePVal;
    }

    public void setEncOCFairePVal(Float encOCFairePVal) {
        EncOCFairePVal = encOCFairePVal;
    }

    public Float getEncOCpolIIPVal() {
        return EncOCpolIIPVal;
    }

    public void setEncOCpolIIPVal(Float encOCpolIIPVal) {
        EncOCpolIIPVal = encOCpolIIPVal;
    }

    public Float getEncOCctcfPVal() {
        return EncOCctcfPVal;
    }

    public void setEncOCctcfPVal(Float encOCctcfPVal) {
        EncOCctcfPVal = encOCctcfPVal;
    }

    public Float getEncOCmycPVal() {
        return EncOCmycPVal;
    }

    public void setEncOCmycPVal(Float encOCmycPVal) {
        EncOCmycPVal = encOCmycPVal;
    }

    public Float getEncOCDNaseSig() {
        return EncOCDNaseSig;
    }

    public void setEncOCDNaseSig(Float encOCDNaseSig) {
        EncOCDNaseSig = encOCDNaseSig;
    }

    public Float getEncOCFaireSig() {
        return EncOCFaireSig;
    }

    public void setEncOCFaireSig(Float encOCFaireSig) {
        EncOCFaireSig = encOCFaireSig;
    }

    public Float getEncOCpolIISig() {
        return EncOCpolIISig;
    }

    public void setEncOCpolIISig(Float encOCpolIISig) {
        EncOCpolIISig = encOCpolIISig;
    }

    public Float getEncOCctcfSig() {
        return EncOCctcfSig;
    }

    public void setEncOCctcfSig(Float encOCctcfSig) {
        EncOCctcfSig = encOCctcfSig;
    }

    public Float getEncOCmycSig() {
        return EncOCmycSig;
    }

    public void setEncOCmycSig(Float encOCmycSig) {
        EncOCmycSig = encOCmycSig;
    }

    public List<CaddValues> getValuesCadd() {
        return valuesCadd;
    }

    public void setValuesCadd(List<CaddValues> valuesCadd) {
        this.valuesCadd = valuesCadd;
    }
}
