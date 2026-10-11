package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zg0 extends View implements m26 {
    public ah0 A;
    public float B;
    public final ArrayList x;
    public List y;
    public float z;

    public zg0(Context context, int i) {
        super(context, null);
        this.x = new ArrayList();
        this.y = Collections.EMPTY_LIST;
        this.z = 0.0533f;
        this.A = ah0.g;
        this.B = 0.08f;
    }

    @Override // defpackage.m26
    public final void a(List list, ah0 ah0Var, float f, float f2) {
        this.y = list;
        this.A = ah0Var;
        this.z = f;
        this.B = f2;
        while (true) {
            ArrayList arrayList = this.x;
            if (arrayList.size() < list.size()) {
                arrayList.add(new v16(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0391  */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [i90] */
    /* JADX WARN: Type inference failed for: r7v6, types: [i90] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r48) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg0.dispatchDraw(android.graphics.Canvas):void");
    }
}
