package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends k {
    public b G;
    public q6.g H;
    public int I = -1;
    public int J = -1;
    public boolean K;

    public e(b bVar, Resources resources) {
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0273, code lost:
    
        r4.onStateChange(r4.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x027a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
    
        r5 = r25.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        if (r5 != 4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0105, code lost:
    
        if (r5 != 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r25.getName().equals("vector") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        r5 = new r3.o();
        r5.inflate(r1, r3, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        r5 = h.b.a(r1, r3, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        if (r5 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        r10 = r4.G;
        r5 = r10.a(r5);
        r10.H[r5] = r7;
        r10.J.d(r5, java.lang.Integer.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r25.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g.e e(android.content.Context r21, android.content.res.Resources.Theme r22, android.content.res.Resources r23, android.util.AttributeSet r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.e(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, android.content.res.XmlResourceParser):g.e");
    }

    @Override // g.i
    public final void d(b bVar) {
        this.f4155a = bVar;
        int i10 = this.f4161x;
        if (i10 >= 0) {
            Drawable d10 = bVar.d(i10);
            this.f4157c = d10;
            if (d10 != null) {
                b(d10);
            }
        }
        this.f4158d = null;
        if (bVar instanceof j) {
            this.E = bVar;
        }
        if (bVar instanceof b) {
            this.G = bVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // g.i, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        q6.g gVar = this.H;
        if (gVar != null) {
            gVar.n0();
            this.H = null;
            c(this.I);
            this.I = -1;
            this.J = -1;
        }
    }

    @Override // g.k, g.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.K) {
            super.mutate();
            this.G.e();
            this.K = true;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    @Override // g.k, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.onStateChange(int[]):boolean");
    }

    @Override // g.i, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        q6.g gVar = this.H;
        if (gVar != null && (visible || z10)) {
            if (z9) {
                gVar.m0();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
