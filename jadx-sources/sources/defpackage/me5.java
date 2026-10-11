package defpackage;

import com.anistation.model.SearchSuggestion;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class me5 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public me5(p72 p72Var, String str, w44 w44Var, w44 w44Var2) {
        this.x = (byte) 2;
        this.B = p72Var;
        this.z = str;
        this.y = w44Var;
        this.A = w44Var2;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.B;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                String str = (String) obj3;
                yu5.l((ic6) obj4, str);
                p72.a((p72) obj);
                ((ub2) obj2).invoke(str);
                return pn6Var;
            case 1:
                String str2 = (String) obj3;
                yu5.l((ic6) obj4, str2);
                ((ub2) obj2).invoke(str2);
                w72.a((w72) obj);
                return pn6Var;
            case 2:
                p72.a((p72) obj);
                ((w44) obj4).setValue((String) obj3);
                ((w44) obj2).setValue(Boolean.TRUE);
                return pn6Var;
            case 3:
                SearchSuggestion searchSuggestion = (SearchSuggestion) obj3;
                yu5.l((ic6) obj4, searchSuggestion.getTitle());
                p72.a((p72) obj);
                ((ub2) obj2).invoke(searchSuggestion.getTitle());
                return pn6Var;
            default:
                SearchSuggestion searchSuggestion2 = (SearchSuggestion) obj3;
                yu5.l((ic6) obj4, searchSuggestion2.getTitle());
                ((ub2) obj2).invoke(searchSuggestion2.getTitle());
                w72.a((w72) obj);
                return pn6Var;
        }
    }

    public /* synthetic */ me5(ic6 ic6Var, Object obj, p72 p72Var, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = ic6Var;
        this.z = obj;
        this.B = p72Var;
        this.A = ub2Var;
    }

    public /* synthetic */ me5(ic6 ic6Var, Object obj, ub2 ub2Var, w72 w72Var, byte b) {
        this.x = b;
        this.y = ic6Var;
        this.z = obj;
        this.A = ub2Var;
        this.B = w72Var;
    }
}
