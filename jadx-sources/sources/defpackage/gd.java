package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gd implements fi4 {
    public final List A;
    public final p82 B;
    public final ud1 C;
    public final nf D;
    public final CharSequence E;
    public final na3 F;
    public st3 G;
    public final boolean H;
    public final int I;
    public final int J;
    public final String x;
    public final xd6 y;
    public final List z;

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03cf, code lost:
    
        if ((r7.b.c & 1095216660480L) != 0) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x009d, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x086d A[LOOP:6: B:296:0x086b->B:297:0x086d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gd] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.TextPaint, nf, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gd(java.lang.String r41, defpackage.xd6 r42, java.util.List r43, java.util.List r44, defpackage.p82 r45, defpackage.ud1 r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd.<init>(java.lang.String, xd6, java.util.List, java.util.List, p82, ud1, boolean):void");
    }

    @Override // defpackage.fi4
    public final boolean c() {
        boolean z;
        st3 st3Var = this.G;
        if (st3Var != null) {
            z = st3Var.A();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.H && wk6.q(this.y)) {
                i75 i75Var = os1.a;
                i75 i75Var2 = os1.a;
                px5 px5Var = (px5) i75Var2.y;
                if (px5Var == null) {
                    if (ks1.d()) {
                        px5Var = i75Var2.m();
                        i75Var2.y = px5Var;
                    } else {
                        px5Var = iv.e;
                    }
                }
                if (((Boolean) px5Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.fi4
    public final float i() {
        na3 na3Var = this.F;
        float f = na3Var.e;
        TextPaint textPaint = na3Var.b;
        if (!Float.isNaN(f)) {
            return na3Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = na3Var.a;
        lineInstance.setText(new fl0(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, jf7.A);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new d13(i, next, 1));
            } else {
                f13 f13Var = (f13) priorityQueue.peek();
                if (f13Var != null && f13Var.y - f13Var.x < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new d13(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                f13 f13Var2 = (f13) it.next();
                f2 = Layout.getDesiredWidth(na3Var.b(), f13Var2.x, f13Var2.y, textPaint);
                while (it.hasNext()) {
                    f13 f13Var3 = (f13) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(na3Var.b(), f13Var3.x, f13Var3.y, textPaint));
                }
            } else {
                qi2.e();
                return 0.0f;
            }
        }
        na3Var.e = f2;
        return f2;
    }

    @Override // defpackage.fi4
    public final float m() {
        return this.F.c();
    }
}
