package defpackage;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k05 implements InputConnection {
    public final i75 a;
    public final boolean b;
    public final uf3 c;
    public final jb6 d;
    public final rv6 e;
    public int f;
    public mc6 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public k05(mc6 mc6Var, i75 i75Var, boolean z, uf3 uf3Var, jb6 jb6Var, rv6 rv6Var) {
        this.a = i75Var;
        this.b = z;
        this.c = uf3Var;
        this.d = jb6Var;
        this.e = rv6Var;
        this.g = mc6Var;
    }

    public final void a(or1 or1Var) {
        this.f++;
        try {
            this.j.add(or1Var);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((vf3) this.a.y).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        if (this.f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (z) {
            this.f++;
            return true;
        }
        return z;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((vf3) this.a.y).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (a34.i(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        if (z) {
            return this.b;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new mq0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new nd1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new od1(i, i2));
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, or1] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (z) {
            a(new Object());
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        mc6 mc6Var = this.g;
        return TextUtils.getCapsMode(mc6Var.a.y, nd6.g(mc6Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.i = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.h = i2;
        }
        return h41.f0(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (nd6.d(this.g.b)) {
            return null;
        }
        return gv5.d(this.g).y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return gv5.e(this.g, i).y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return gv5.f(this.g, i).y;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new zk5(0, this.g.a.y.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((vf3) this.a.y).d.invoke(new sv2(i2));
            }
            i2 = 1;
            ((vf3) this.a.y).d.invoke(new sv2(i2));
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, u05] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        ko koVar;
        ko koVar2;
        PointF startPoint;
        PointF endPoint;
        int i;
        PointF insertionPoint;
        int i2;
        cd6 d;
        String textToInsert;
        PointF joinOrSplitPoint;
        int i3;
        cd6 d2;
        int granularity;
        int i4;
        RectF deletionStartArea;
        RectF deletionEndArea;
        boolean z;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i5;
        int granularity3;
        int i6;
        RectF deletionArea;
        boolean z2;
        RectF selectionArea;
        int granularity4;
        int i7;
        if (Build.VERSION.SDK_INT >= 34) {
            pz3 pz3Var = new pz3(this, (byte) 14);
            uf3 uf3Var = this.c;
            int i8 = 3;
            if (uf3Var != null && (koVar = uf3Var.j) != null) {
                cd6 d3 = uf3Var.d();
                bd6 bd6Var = null;
                if (d3 != null) {
                    koVar2 = d3.a.a.a;
                } else {
                    koVar2 = null;
                }
                if (koVar.equals(koVar2)) {
                    boolean q = sy1.q(handwritingGesture);
                    jb6 jb6Var = this.d;
                    if (q) {
                        SelectGesture n = sy1.n(handwritingGesture);
                        selectionArea = n.getSelectionArea();
                        n05 S = z51.S(selectionArea);
                        granularity4 = n.getGranularity();
                        if (granularity4 != 1) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        long S2 = t80.S(uf3Var, S, i7);
                        if (nd6.d(S2)) {
                            i8 = o80.u(sy1.j(n), pz3Var);
                        } else {
                            pz3Var.invoke(new zk5((int) (S2 >> 32), (int) (S2 & 4294967295L)));
                            if (jb6Var != null) {
                                jb6Var.e(true);
                            }
                            i8 = 1;
                        }
                    } else if (nj2.x(handwritingGesture)) {
                        DeleteGesture k = nj2.k(handwritingGesture);
                        granularity3 = k.getGranularity();
                        if (granularity3 != 1) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                        deletionArea = k.getDeletionArea();
                        long S3 = t80.S(uf3Var, z51.S(deletionArea), i6);
                        if (nd6.d(S3)) {
                            i8 = o80.u(sy1.j(k), pz3Var);
                        } else {
                            if (i6 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            o80.G(S3, koVar, z2, pz3Var);
                            i8 = 1;
                        }
                    } else if (nj2.B(handwritingGesture)) {
                        SelectRangeGesture m = nj2.m(handwritingGesture);
                        selectionStartArea = m.getSelectionStartArea();
                        n05 S4 = z51.S(selectionStartArea);
                        selectionEndArea = m.getSelectionEndArea();
                        n05 S5 = z51.S(selectionEndArea);
                        granularity2 = m.getGranularity();
                        if (granularity2 != 1) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        long U = t80.U(uf3Var, S4, S5, i5);
                        if (nd6.d(U)) {
                            i8 = o80.u(sy1.j(m), pz3Var);
                        } else {
                            pz3Var.invoke(new zk5((int) (U >> 32), (int) (U & 4294967295L)));
                            if (jb6Var != null) {
                                jb6Var.e(true);
                            }
                            i8 = 1;
                        }
                    } else if (nj2.D(handwritingGesture)) {
                        DeleteRangeGesture l = nj2.l(handwritingGesture);
                        granularity = l.getGranularity();
                        if (granularity != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        deletionStartArea = l.getDeletionStartArea();
                        n05 S6 = z51.S(deletionStartArea);
                        deletionEndArea = l.getDeletionEndArea();
                        long U2 = t80.U(uf3Var, S6, z51.S(deletionEndArea), i4);
                        if (nd6.d(U2)) {
                            i8 = o80.u(sy1.j(l), pz3Var);
                        } else {
                            if (i4 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            o80.G(U2, koVar, z, pz3Var);
                            i8 = 1;
                        }
                    } else {
                        boolean B = sy1.B(handwritingGesture);
                        rv6 rv6Var = this.e;
                        if (B) {
                            JoinOrSplitGesture l2 = sy1.l(handwritingGesture);
                            if (rv6Var != null) {
                                joinOrSplitPoint = l2.getJoinOrSplitPoint();
                                long m0 = t80.m0(joinOrSplitPoint);
                                cd6 d4 = uf3Var.d();
                                if (d4 != null) {
                                    i3 = t80.Q(d4.a.b, m0, uf3Var.c(), rv6Var);
                                } else {
                                    i3 = -1;
                                }
                                if (i3 != -1 && ((d2 = uf3Var.d()) == null || !t80.X(d2.a, i3))) {
                                    long i0 = t80.i0(koVar, i3);
                                    if (nd6.d(i0)) {
                                        int i9 = (int) (i0 >> 32);
                                        pz3Var.invoke(new pj2(new or1[]{new zk5(i9, i9), new mq0(" ", 1)}));
                                    } else {
                                        o80.G(i0, koVar, false, pz3Var);
                                    }
                                    i8 = 1;
                                } else {
                                    i8 = o80.u(sy1.j(l2), pz3Var);
                                }
                            } else {
                                i8 = o80.u(sy1.v(l2), pz3Var);
                            }
                        } else if (sy1.w(handwritingGesture)) {
                            InsertGesture k2 = sy1.k(handwritingGesture);
                            if (rv6Var != null) {
                                insertionPoint = k2.getInsertionPoint();
                                long m02 = t80.m0(insertionPoint);
                                cd6 d5 = uf3Var.d();
                                if (d5 != null) {
                                    i2 = t80.Q(d5.a.b, m02, uf3Var.c(), rv6Var);
                                } else {
                                    i2 = -1;
                                }
                                if (i2 != -1 && ((d = uf3Var.d()) == null || !t80.X(d.a, i2))) {
                                    textToInsert = k2.getTextToInsert();
                                    pz3Var.invoke(new pj2(new or1[]{new zk5(i2, i2), new mq0(textToInsert, 1)}));
                                    i8 = 1;
                                } else {
                                    i8 = o80.u(sy1.j(k2), pz3Var);
                                }
                            } else {
                                i8 = o80.u(sy1.v(k2), pz3Var);
                            }
                        } else if (sy1.z(handwritingGesture)) {
                            RemoveSpaceGesture m2 = sy1.m(handwritingGesture);
                            cd6 d6 = uf3Var.d();
                            if (d6 != null) {
                                bd6Var = d6.a;
                            }
                            bd6 bd6Var2 = bd6Var;
                            startPoint = m2.getStartPoint();
                            long m03 = t80.m0(startPoint);
                            endPoint = m2.getEndPoint();
                            long R = t80.R(bd6Var2, m03, t80.m0(endPoint), uf3Var.c(), rv6Var);
                            if (nd6.d(R)) {
                                i8 = o80.u(sy1.j(m2), pz3Var);
                            } else {
                                ?? obj = new Object();
                                obj.x = -1;
                                ?? obj2 = new Object();
                                obj2.x = -1;
                                String c = new c15("\\s+").c(fy5.h(R, koVar), new oj2(obj, obj2, (byte) 1));
                                int i10 = obj.x;
                                if (i10 != -1 && (i = obj2.x) != -1) {
                                    int i11 = (int) (R >> 32);
                                    pz3Var.invoke(new pj2(new or1[]{new zk5(i11 + i10, i11 + i), new mq0(c.substring(i10, c.length() - (nd6.e(R) - obj2.x)), 1)}));
                                    i8 = 1;
                                } else {
                                    i8 = o80.u(sy1.j(m2), pz3Var);
                                }
                            }
                        } else {
                            i8 = 2;
                        }
                    }
                }
            }
            if (intConsumer != null) {
                if (executor != null) {
                    executor.execute(new xo(intConsumer, i8, (byte) 0));
                } else {
                    intConsumer.accept(i8);
                }
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        uf3 uf3Var;
        ko koVar;
        ko koVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i2;
        RectF deletionArea;
        int granularity3;
        int i3;
        RectF selectionArea;
        int granularity4;
        int i4;
        if (Build.VERSION.SDK_INT >= 34 && (uf3Var = this.c) != null && (koVar = uf3Var.j) != null) {
            cd6 d = uf3Var.d();
            if (d != null) {
                koVar2 = d.a.a.a;
            } else {
                koVar2 = null;
            }
            if (koVar.equals(koVar2)) {
                boolean q = sy1.q(previewableHandwritingGesture);
                hj2 hj2Var = hj2.x;
                jb6 jb6Var = this.d;
                if (q) {
                    SelectGesture n = sy1.n(previewableHandwritingGesture);
                    if (jb6Var != null) {
                        selectionArea = n.getSelectionArea();
                        n05 S = z51.S(selectionArea);
                        granularity4 = n.getGranularity();
                        if (granularity4 != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long S2 = t80.S(uf3Var, S, i4);
                        uf3 uf3Var2 = jb6Var.d;
                        if (uf3Var2 != null) {
                            uf3Var2.f(S2);
                        }
                        uf3 uf3Var3 = jb6Var.d;
                        if (uf3Var3 != null) {
                            uf3Var3.e(nd6.b);
                        }
                        if (!nd6.d(S2)) {
                            jb6Var.u(false);
                            jb6Var.r(hj2Var);
                        }
                    }
                } else if (nj2.x(previewableHandwritingGesture)) {
                    DeleteGesture k = nj2.k(previewableHandwritingGesture);
                    if (jb6Var != null) {
                        deletionArea = k.getDeletionArea();
                        n05 S3 = z51.S(deletionArea);
                        granularity3 = k.getGranularity();
                        if (granularity3 != 1) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        long S4 = t80.S(uf3Var, S3, i3);
                        uf3 uf3Var4 = jb6Var.d;
                        if (uf3Var4 != null) {
                            uf3Var4.e(S4);
                        }
                        uf3 uf3Var5 = jb6Var.d;
                        if (uf3Var5 != null) {
                            uf3Var5.f(nd6.b);
                        }
                        if (!nd6.d(S4)) {
                            jb6Var.u(false);
                            jb6Var.r(hj2Var);
                        }
                    }
                } else if (nj2.B(previewableHandwritingGesture)) {
                    SelectRangeGesture m = nj2.m(previewableHandwritingGesture);
                    if (jb6Var != null) {
                        selectionStartArea = m.getSelectionStartArea();
                        n05 S5 = z51.S(selectionStartArea);
                        selectionEndArea = m.getSelectionEndArea();
                        n05 S6 = z51.S(selectionEndArea);
                        granularity2 = m.getGranularity();
                        if (granularity2 != 1) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        long U = t80.U(uf3Var, S5, S6, i2);
                        uf3 uf3Var6 = jb6Var.d;
                        if (uf3Var6 != null) {
                            uf3Var6.f(U);
                        }
                        uf3 uf3Var7 = jb6Var.d;
                        if (uf3Var7 != null) {
                            uf3Var7.e(nd6.b);
                        }
                        if (!nd6.d(U)) {
                            jb6Var.u(false);
                            jb6Var.r(hj2Var);
                        }
                    }
                } else if (nj2.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture l = nj2.l(previewableHandwritingGesture);
                    if (jb6Var != null) {
                        deletionStartArea = l.getDeletionStartArea();
                        n05 S7 = z51.S(deletionStartArea);
                        deletionEndArea = l.getDeletionEndArea();
                        n05 S8 = z51.S(deletionEndArea);
                        granularity = l.getGranularity();
                        if (granularity != 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        long U2 = t80.U(uf3Var, S7, S8, i);
                        uf3 uf3Var8 = jb6Var.d;
                        if (uf3Var8 != null) {
                            uf3Var8.e(U2);
                        }
                        uf3 uf3Var9 = jb6Var.d;
                        if (uf3Var9 != null) {
                            uf3Var9.f(nd6.b);
                        }
                        if (!nd6.d(U2)) {
                            jb6Var.u(false);
                            jb6Var.r(hj2Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new ot0(jb6Var, (byte) 1));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            i75 r9 = r9.a
            java.lang.Object r9 = r9.y
            vf3 r9 = (defpackage.vf3) r9
            pf3 r9 = r9.m
            java.lang.Object r4 = r9.c
            monitor-enter(r4)
            r9.f = r5     // Catch: java.lang.Throwable -> L6f
            r9.g = r6     // Catch: java.lang.Throwable -> L6f
            r9.h = r1     // Catch: java.lang.Throwable -> L6f
            r9.i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r9.e = r2     // Catch: java.lang.Throwable -> L6f
            mc6 r10 = r9.j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r9.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r9.d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return r2
        L75:
            monitor-exit(r4)
            throw r9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k05.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (z) {
            ((BaseInputConnection) ((vf3) this.a.y).k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new xk5(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new yk5(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new zk5(i, i2));
            return true;
        }
        return z;
    }
}
