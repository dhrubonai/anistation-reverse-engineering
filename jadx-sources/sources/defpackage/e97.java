package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class e97 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.b97 a(defpackage.q0 r7, defpackage.yt0 r8, defpackage.os0 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.kh2.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            za0 r0 = defpackage.iv.d(r2, r0, r3)
            d46 r4 = defpackage.sf.I
            java.lang.Object r4 = r4.getValue()
            l11 r4 = (defpackage.l11) r4
            ke0 r4 = defpackage.db.b(r4)
            e0 r5 = new e0
            r5.<init>(r0, r3)
            r6 = 3
            defpackage.tl7.z(r4, r3, r3, r5, r6)
            lz0 r4 = new lz0
            r5 = 9
            r4.<init>(r0, r5)
            java.lang.Object r0 = defpackage.mt5.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.mt5.i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r4 = defpackage.yo0.v0(r5, r4)     // Catch: java.lang.Throwable -> L3c
            defpackage.mt5.i = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            defpackage.mt5.c()
            goto L3f
        L3c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3f:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L59
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.oa
            if (r1 == 0) goto L50
            oa r0 = (defpackage.oa) r0
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 == 0) goto L57
            r0.setComposeViewContext(r8)
            goto L5d
        L57:
            r0 = r3
            goto L5d
        L59:
            r7.removeAllViews()
            goto L57
        L5d:
            if (r0 != 0) goto L71
            oa r0 = new oa
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.e97.a
            r7.addView(r1, r4)
        L71:
            r0.setComposeViewContext(r8)
            yt0 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L80
            r8.e()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L80:
            r7 = 2131362541(0x7f0a02ed, float:1.8344865E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.b97
            if (r2 == 0) goto L8e
            r3 = r1
            b97 r3 = (defpackage.b97) r3
        L8e:
            if (r3 != 0) goto Laa
            b97 r3 = new b97
            rm6 r1 = new rm6
            za3 r2 = r0.getRoot()
            r1.<init>(r2)
            qu0 r2 = r8.c()
            vu0 r4 = new vu0
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Laa:
            r3.b(r9)
            qu0 r7 = r8.c()
            d97 r8 = new d97
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e97.a(q0, yt0, os0):b97");
    }
}
