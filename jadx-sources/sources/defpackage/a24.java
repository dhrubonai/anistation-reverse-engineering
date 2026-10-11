package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a24 implements y16 {
    public final zi4 x = new zi4();

    @Override // defpackage.y16
    public final void E(byte[] bArr, int i, int i2, x16 x16Var, ay0 ay0Var) {
        boolean z;
        b31 a;
        boolean z2;
        zi4 zi4Var = this.x;
        zi4Var.L(i2 + i, bArr);
        zi4Var.N(i);
        ArrayList arrayList = new ArrayList();
        while (zi4Var.a() > 0) {
            if (zi4Var.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            io3.m("Incomplete Mp4Webvtt Top Level box header found.", z);
            int m = zi4Var.m();
            if (zi4Var.m() == 1987343459) {
                int i3 = m - 8;
                CharSequence charSequence = null;
                a31 a31Var = null;
                while (i3 > 0) {
                    if (i3 >= 8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    io3.m("Incomplete vtt cue box header found.", z2);
                    int m2 = zi4Var.m();
                    int m3 = zi4Var.m();
                    int i4 = m2 - 8;
                    byte[] bArr2 = zi4Var.a;
                    int i5 = zi4Var.b;
                    String str = eq6.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    zi4Var.O(i4);
                    i3 = (i3 - 8) - i4;
                    if (m3 == 1937011815) {
                        i47 i47Var = new i47();
                        j47.e(str2, i47Var);
                        a31Var = i47Var.a();
                    } else if (m3 == 1885436268) {
                        charSequence = j47.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (a31Var != null) {
                    a31Var.a = charSequence;
                    a31Var.b = null;
                    a = a31Var.a();
                } else {
                    Pattern pattern = j47.a;
                    i47 i47Var2 = new i47();
                    i47Var2.c = charSequence;
                    a = i47Var2.a().a();
                }
                arrayList.add(a);
            } else {
                zi4Var.O(m - 8);
            }
        }
        ay0Var.accept(new e31(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
