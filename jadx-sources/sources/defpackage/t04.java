package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t04 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final sl3 e = new sl3((Object) null);
    public int f = -1;
    public int g = -1;
    public boolean h;
    public boolean i;
    public xc4 j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId) < 0) {
                    long j = this.a;
                    this.a = 1 + j;
                    sparseLongArray.put(pointerId, j);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType == this.f && source == this.g) {
                return;
            }
            this.f = toolType;
            this.g = source;
            this.c.clear();
            this.b.clear();
        }
    }

    public final l33 c(MotionEvent motionEvent, oa oaVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked != 3 && actionMasked != 4) {
            b(motionEvent);
            a(motionEvent);
            if (actionMasked != 9 && actionMasked != 7 && actionMasked != 10) {
                z = false;
            } else {
                z = true;
            }
            if (actionMasked == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
            }
            if (actionMasked != 1) {
                if (actionMasked != 6) {
                    actionIndex = -1;
                } else {
                    actionIndex = motionEvent.getActionIndex();
                }
                i = actionIndex;
            } else {
                i = 0;
            }
            ArrayList arrayList = this.d;
            arrayList.clear();
            if (motionEvent.getActionMasked() == 0) {
                if (Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z4 || z5) {
                    this.h = true;
                }
            }
            if (Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5)) {
                if (motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 1) {
                    if (motionEvent.getActionMasked() == 1) {
                        this.h = false;
                        this.i = false;
                        this.j = null;
                    }
                    e(motionEvent);
                    return null;
                }
                this.i = true;
                if (motionEvent.getActionMasked() == 0) {
                    float rawX = motionEvent.getRawX(0);
                    float rawY = motionEvent.getRawY(0);
                    this.j = new xc4((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
                } else if (motionEvent.getActionMasked() == 5 && motionEvent.getClassification() == 5 && motionEvent.getPointerCount() == 2) {
                    float rawX2 = (motionEvent.getRawX(1) + motionEvent.getRawX(0)) / 2.0f;
                    float rawY2 = (motionEvent.getRawY(1) + motionEvent.getRawY(0)) / 2.0f;
                    this.j = new xc4((Float.floatToRawIntBits(rawX2) << 32) | (Float.floatToRawIntBits(rawY2) & 4294967295L));
                }
                arrayList.add(d(oaVar, motionEvent, this.j, 0, false));
            } else {
                this.i = false;
                int pointerCount = motionEvent.getPointerCount();
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    if (!z && i2 != i && (!z2 || motionEvent.getButtonState() != 0)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(d(oaVar, motionEvent, null, i2, z3));
                }
            }
            if (motionEvent.getActionMasked() == 1) {
                this.h = false;
                this.i = false;
                this.j = null;
            }
            e(motionEvent);
            motionEvent.getEventTime();
            return new l33(arrayList, motionEvent, (byte) 13);
        }
        this.b.clear();
        sparseBooleanArray.clear();
        this.h = false;
        this.i = false;
        this.j = null;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if (r1 != 4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164 A[EDGE_INSN: B:40:0x0164->B:41:0x0164 BREAK  A[LOOP:0: B:20:0x00d6->B:36:0x015c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wq4 d(defpackage.oa r46, android.view.MotionEvent r47, defpackage.xc4 r48, int r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t04.d(oa, android.view.MotionEvent, xc4, int, boolean):wq4");
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i < pointerCount) {
                        if (motionEvent.getPointerId(i) == keyAt) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                }
            }
        }
    }
}
