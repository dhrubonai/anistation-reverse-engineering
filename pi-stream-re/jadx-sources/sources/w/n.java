package w;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.m0;
import r6.h0;

/* loaded from: classes.dex */
public abstract class n extends Activity implements androidx.lifecycle.u, g0.l {
    private n.k mExtraDataMap = new n.k();
    private androidx.lifecycle.w mLifecycleRegistry = new androidx.lifecycle.w(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && h0.K(decorView, keyEvent)) {
            return true;
        }
        return h0.L(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && h0.K(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated
    public <T extends m> T getExtraData(Class<T> cls) {
        a3.g.z(this.mExtraDataMap.getOrDefault(cls, null));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = m0.f1109b;
        j6.e.s(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.w wVar = this.mLifecycleRegistry;
        wVar.getClass();
        wVar.d("markState");
        wVar.g();
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(m mVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L6a
            int r2 = r5.length
            if (r2 <= 0) goto L6a
            r5 = r5[r0]
            r5.getClass()
            int r2 = r5.hashCode()
            r3 = -1
            switch(r2) {
                case -645125871: goto L41;
                case 100470631: goto L36;
                case 472614934: goto L2b;
                case 1159329357: goto L20;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L4b
        L15:
            java.lang.String r2 = "--autofill"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L1e
            goto L4b
        L1e:
            r3 = 4
            goto L4b
        L20:
            java.lang.String r2 = "--contentcapture"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L29
            goto L4b
        L29:
            r3 = 3
            goto L4b
        L2b:
            java.lang.String r2 = "--list-dumpables"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L34
            goto L4b
        L34:
            r3 = 2
            goto L4b
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L3f
            goto L4b
        L3f:
            r3 = r1
            goto L4b
        L41:
            java.lang.String r2 = "--translation"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L4a
            goto L4b
        L4a:
            r3 = r0
        L4b:
            switch(r3) {
                case 0: goto L63;
                case 1: goto L5e;
                case 2: goto L5e;
                case 3: goto L57;
                case 4: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L6a
        L4f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r5 < r2) goto L6a
        L55:
            r0 = r1
            goto L6a
        L57:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r5 < r2) goto L6a
            goto L55
        L5e:
            boolean r0 = com.bumptech.glide.d.G()
            goto L6a
        L63:
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r5 < r2) goto L6a
            goto L55
        L6a:
            r5 = r0 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // g0.l
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
