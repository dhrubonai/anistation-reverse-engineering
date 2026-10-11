package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uw6 implements y16 {
    public static final e31 B;
    public Inflater A;
    public final zi4 x = new zi4();
    public final zi4 y = new zi4();
    public final tw6 z;

    static {
        z62 z62Var = nw2.y;
        B = new e31(-9223372036854775807L, -9223372036854775807L, o15.B);
    }

    public uw6(List list) {
        int i;
        tw6 tw6Var = new tw6();
        this.z = tw6Var;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = eq6.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                tw6Var.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = tw6Var.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        kb0.P("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    kb0.O("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        tw6Var.g = Integer.parseInt(split2[0]);
                        tw6Var.h = Integer.parseInt(split2[1]);
                        tw6Var.d = true;
                    } catch (RuntimeException e2) {
                        kb0.P("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028c  */
    @Override // defpackage.y16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(byte[] r26, int r27, int r28, defpackage.x16 r29, defpackage.ay0 r30) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw6.E(byte[], int, int, x16, ay0):void");
    }
}
