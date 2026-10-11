package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class an4 extends t36 implements ic2 {
    public byte A;
    public /* synthetic */ Object B;
    public final /* synthetic */ CharSequence C;
    public final /* synthetic */ long D;
    public final /* synthetic */ bn4 E;
    public m54 x;
    public bn4 y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an4(CharSequence charSequence, long j, bn4 bn4Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = charSequence;
        this.D = j;
        this.E = bn4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        an4 an4Var = new an4(this.C, this.D, this.E, vz0Var);
        an4Var.B = obj;
        return an4Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((an4) create((TextClassifier) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        long j;
        TextClassification textClassification;
        TextClassification textClassification2;
        m54 m54Var;
        l86 l86Var;
        bn4 bn4Var;
        byte b = this.A;
        if (b != 0) {
            if (b != 1) {
                if (b == 2) {
                    j = this.z;
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j = this.z;
                bn4Var = this.y;
                m54Var = this.x;
                l86Var = (l86) this.B;
                m37.N(obj);
                try {
                    bn4Var.g.setValue(l86Var);
                } finally {
                    m54Var.l(null);
                }
            }
        } else {
            m37.N(obj);
            TextClassifier textClassifier = (TextClassifier) this.B;
            long j2 = this.D;
            int g = nd6.g(j2);
            int f = nd6.f(j2);
            CharSequence charSequence = this.C;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, g, f);
            bn4 bn4Var2 = this.E;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(bn4Var2.c());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long a = fy5.a(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            w11 w11Var = w11.x;
            if (i >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    textClassification2 = suggestSelection.getTextClassification();
                    textClassification2.getClass();
                    l86 b2 = bn4Var2.b(charSequence, a, textClassification2);
                    m54Var = bn4Var2.e;
                    this.B = b2;
                    this.x = m54Var;
                    this.y = bn4Var2;
                    this.z = a;
                    this.A = (byte) 1;
                    if (m54Var.a(this) != w11Var) {
                        l86Var = b2;
                        bn4Var = bn4Var2;
                        j = a;
                        bn4Var.g.setValue(l86Var);
                    }
                    return w11Var;
                }
            }
            this.z = a;
            this.A = (byte) 2;
            if (this.E.a(this.C, a, textClassifier, this) != w11Var) {
                j = a;
            }
            return w11Var;
        }
        return new nd6(j);
    }
}
