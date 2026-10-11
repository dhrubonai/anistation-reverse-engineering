package defpackage;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
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
import android.view.inputmethod.TextAttribute;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ay5 implements InputConnection {
    public final kf a;
    public final z44 b = new z44(new ub2[16], 0);
    public final mz2 c;

    public ay5(kf kfVar, EditorInfo editorInfo) {
        this.a = kfVar;
        mz2 mz2Var = new mz2((InputConnection) this, false);
        xb5 xb5Var = new xb5(this);
        if (editorInfo != null) {
            this.c = new mz2(mz2Var, xb5Var);
        } else {
            qi2.m("editorInfo must be non-null");
            throw null;
        }
    }

    public final p96 a() {
        return ((gi6) this.a.A).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((ad) this.a.y).y++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.h();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        CharSequence charSequence;
        if (completionInfo != null) {
            charSequence = completionInfo.getText();
        } else {
            charSequence = null;
        }
        Objects.toString(charSequence);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return this.c.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        boolean z;
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        if (Build.VERSION.SDK_INT >= 37 && textAttribute != null) {
            z = textAttribute.isTextSuggestionSelected();
        } else {
            z = false;
        }
        this.a.f(new xv2(charSequence.toString(), i, z));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        kf kfVar = this.a;
        kfVar.f(new vv2(i, i2, kfVar, (byte) 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        this.a.f(new ub2() { // from class: uv2
            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                o96 o96Var = (o96) obj;
                int i3 = i;
                int i4 = i2;
                if (i3 < 0 || i4 < 0) {
                    hz2.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.");
                }
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= i3) {
                        break;
                    }
                    int i8 = i7 + 1;
                    long j = o96Var.C;
                    kk0 kk0Var = o96Var.y;
                    int g = nd6.g(j);
                    long j2 = o96Var.C;
                    if (g > i8) {
                        char charAt = kk0Var.charAt((nd6.g(j2) - i8) - 1);
                        char charAt2 = kk0Var.charAt(nd6.g(o96Var.C) - i8);
                        if (Character.isHighSurrogate(charAt) && Character.isLowSurrogate(charAt2)) {
                            i7 += 2;
                        } else {
                            i7 = i8;
                        }
                        i6++;
                    } else {
                        i7 = nd6.g(j2);
                        break;
                    }
                }
                int i9 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    int i10 = i9 + 1;
                    long j3 = o96Var.C;
                    kk0 kk0Var2 = o96Var.y;
                    if (nd6.f(j3) + i10 < kk0Var2.length()) {
                        char charAt3 = kk0Var2.charAt((nd6.f(o96Var.C) + i10) - 1);
                        char charAt4 = kk0Var2.charAt(nd6.f(o96Var.C) + i10);
                        if (Character.isHighSurrogate(charAt3) && Character.isLowSurrogate(charAt4)) {
                            i9 += 2;
                        } else {
                            i9 = i10;
                        }
                        i5++;
                    } else {
                        i9 = kk0Var2.length() - nd6.f(o96Var.C);
                        break;
                    }
                }
                h41.G(o96Var, nd6.f(o96Var.C), nd6.f(o96Var.C) + i9);
                h41.G(o96Var, nd6.g(o96Var.C) - i7, nd6.g(o96Var.C));
                return pn6.a;
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((ad) this.a.y).d();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.f(new t72((byte) 24));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), nd6.g(a().B), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        p96 a = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a.A.length();
        extractedText.partialStartOffset = -1;
        long j = a.B;
        extractedText.selectionStart = nd6.g(j);
        extractedText.selectionEnd = nd6.f(j);
        extractedText.flags = !uz5.N(a, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (nd6.d(a().B)) {
            return null;
        }
        p96 a = a();
        return a.A.subSequence(nd6.g(a.B), nd6.f(a.B)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        p96 a = a();
        long j = a.B;
        CharSequence charSequence = a.A;
        int f = nd6.f(j);
        int f2 = nd6.f(a.B);
        int i3 = f2 + i;
        if (((f2 ^ i3) & (i ^ i3)) < 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(f, Math.min(i3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        p96 a = a();
        int g = nd6.g(a.B);
        int i3 = g - i;
        if (((i ^ g) & (g ^ i3)) < 0) {
            i3 = 0;
        }
        return a.A.subSequence(Math.max(0, i3), nd6.g(a.B)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2 = 0;
        switch (i) {
            case R.id.selectAll:
                int length = a().A.length();
                kf kfVar = this.a;
                kfVar.f(new vv2(kfVar, i2, length));
                return false;
            case R.id.cut:
                b(277);
                return false;
            case R.id.copy:
                b(278);
                return false;
            case R.id.paste:
                b(279);
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L6
            switch(r3) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r3 = r0
            goto L13
        L8:
            r3 = 5
            goto L13
        La:
            r3 = 7
            goto L13
        Lc:
            r3 = 6
            goto L13
        Le:
            r3 = 4
            goto L13
        L10:
            r3 = 3
            goto L13
        L12:
            r3 = 2
        L13:
            kf r2 = r2.a
            java.lang.Object r2 = r2.C
            ub2 r2 = (defpackage.ub2) r2
            if (r2 == 0) goto L23
            sv2 r1 = new sv2
            r1.<init>(r3)
            r2.invoke(r1)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay5.performEditorAction(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, u05] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        PointF startPoint;
        PointF endPoint;
        int i;
        PointF insertionPoint;
        int i2;
        String textToInsert;
        PointF joinOrSplitPoint;
        int i3;
        bd6 c;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            int i5 = 2;
            if (i4 >= 34) {
                kf kfVar = this.a;
                gi6 gi6Var = (gi6) kfVar.A;
                dd6 dd6Var = (dd6) kfVar.F;
                sb2 sb2Var = (sb2) kfVar.G;
                rv6 rv6Var = (rv6) kfVar.H;
                int i6 = 0;
                if (sy1.q(handwritingGesture)) {
                    SelectGesture n = sy1.n(handwritingGesture);
                    selectionArea = n.getSelectionArea();
                    n05 S = z51.S(selectionArea);
                    granularity4 = n.getGranularity();
                    if (granularity4 == 1) {
                        i6 = 1;
                    }
                    long T = t80.T(dd6Var, S, i6);
                    if (nd6.d(T)) {
                        i5 = o80.t(gi6Var, sy1.j(n));
                    } else {
                        gi6Var.j(T);
                        if (sb2Var != null) {
                            sb2Var.invoke();
                        }
                        i5 = 1;
                    }
                } else if (nj2.x(handwritingGesture)) {
                    DeleteGesture k = nj2.k(handwritingGesture);
                    granularity3 = k.getGranularity();
                    if (granularity3 == 1) {
                        i6 = 1;
                    }
                    deletionArea = k.getDeletionArea();
                    long T2 = t80.T(dd6Var, z51.S(deletionArea), i6);
                    if (nd6.d(T2)) {
                        i5 = o80.t(gi6Var, sy1.j(k));
                    } else {
                        if (i6 == 1) {
                            T2 = t80.n(T2, gi6Var.d());
                        }
                        gi6.i(gi6Var, "", T2, false, false, 28);
                        i5 = 1;
                    }
                } else if (nj2.B(handwritingGesture)) {
                    SelectRangeGesture m = nj2.m(handwritingGesture);
                    selectionStartArea = m.getSelectionStartArea();
                    n05 S2 = z51.S(selectionStartArea);
                    selectionEndArea = m.getSelectionEndArea();
                    n05 S3 = z51.S(selectionEndArea);
                    granularity2 = m.getGranularity();
                    if (granularity2 == 1) {
                        i6 = 1;
                    }
                    long V = t80.V(dd6Var, S2, S3, i6);
                    if (nd6.d(V)) {
                        i5 = o80.t(gi6Var, sy1.j(m));
                    } else {
                        gi6Var.j(V);
                        if (sb2Var != null) {
                            sb2Var.invoke();
                        }
                        i5 = 1;
                    }
                } else if (nj2.D(handwritingGesture)) {
                    DeleteRangeGesture l = nj2.l(handwritingGesture);
                    granularity = l.getGranularity();
                    if (granularity == 1) {
                        i6 = 1;
                    }
                    deletionStartArea = l.getDeletionStartArea();
                    n05 S4 = z51.S(deletionStartArea);
                    deletionEndArea = l.getDeletionEndArea();
                    long V2 = t80.V(dd6Var, S4, z51.S(deletionEndArea), i6);
                    if (nd6.d(V2)) {
                        i5 = o80.t(gi6Var, sy1.j(l));
                    } else {
                        if (i6 == 1) {
                            V2 = t80.n(V2, gi6Var.d());
                        }
                        gi6.i(gi6Var, "", V2, false, false, 28);
                        i5 = 1;
                    }
                } else if (sy1.B(handwritingGesture)) {
                    JoinOrSplitGesture l2 = sy1.l(handwritingGesture);
                    if (gi6Var.a.c() == gi6Var.a.c()) {
                        joinOrSplitPoint = l2.getJoinOrSplitPoint();
                        long m0 = t80.m0(joinOrSplitPoint);
                        bd6 c2 = dd6Var.c();
                        if (c2 != null) {
                            i3 = t80.Q(c2.b, m0, dd6Var.e(), rv6Var);
                        } else {
                            i3 = -1;
                        }
                        if (i3 != -1 && ((c = dd6Var.c()) == null || !t80.X(c, i3))) {
                            long i0 = t80.i0(gi6Var.d(), i3);
                            if (nd6.d(i0)) {
                                gi6.i(gi6Var, " ", i0, false, false, 28);
                            } else {
                                gi6.i(gi6Var, "", i0, false, false, 28);
                            }
                            i5 = 1;
                        } else {
                            i5 = o80.t(gi6Var, sy1.j(l2));
                        }
                    } else {
                        i5 = 3;
                    }
                } else if (sy1.w(handwritingGesture)) {
                    InsertGesture k2 = sy1.k(handwritingGesture);
                    insertionPoint = k2.getInsertionPoint();
                    long m02 = t80.m0(insertionPoint);
                    bd6 c3 = dd6Var.c();
                    if (c3 != null) {
                        i2 = t80.Q(c3.b, m02, dd6Var.e(), rv6Var);
                    } else {
                        i2 = -1;
                    }
                    if (i2 != -1) {
                        textToInsert = k2.getTextToInsert();
                        gi6.i(gi6Var, textToInsert, fy5.a(i2, i2), false, false, 28);
                        i5 = 1;
                    } else {
                        i5 = o80.t(gi6Var, sy1.j(k2));
                    }
                } else if (sy1.z(handwritingGesture)) {
                    RemoveSpaceGesture m2 = sy1.m(handwritingGesture);
                    bd6 c4 = dd6Var.c();
                    startPoint = m2.getStartPoint();
                    long m03 = t80.m0(startPoint);
                    endPoint = m2.getEndPoint();
                    long R = t80.R(c4, m03, t80.m0(endPoint), dd6Var.e(), rv6Var);
                    if (nd6.d(R)) {
                        i5 = o80.t(gi6Var, sy1.j(m2));
                    } else {
                        ?? obj = new Object();
                        obj.x = -1;
                        ?? obj2 = new Object();
                        obj2.x = -1;
                        String c5 = new c15("\\s+").c(fy5.h(R, gi6Var.d()), new oj2(obj, obj2, (byte) 0));
                        int i7 = obj.x;
                        if (i7 != -1 && (i = obj2.x) != -1) {
                            int i8 = (int) (R >> 32);
                            gi6.i(gi6Var, c5.substring(obj.x, c5.length() - (nd6.e(R) - obj2.x)), fy5.a(i7 + i8, i8 + i), false, false, 28);
                            i5 = 1;
                        } else {
                            i5 = o80.t(gi6Var, sy1.j(m2));
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new xo(intConsumer, i5, (byte) 1));
            } else {
                intConsumer.accept(i5);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        int i2;
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        if (i3 >= 34 && i3 >= 34) {
            kf kfVar = this.a;
            gi6 gi6Var = (gi6) kfVar.A;
            dd6 dd6Var = (dd6) kfVar.F;
            if (sy1.q(previewableHandwritingGesture)) {
                SelectGesture n = sy1.n(previewableHandwritingGesture);
                selectionArea = n.getSelectionArea();
                n05 S = z51.S(selectionArea);
                granularity4 = n.getGranularity();
                if (granularity4 != 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                o80.A(gi6Var, t80.T(dd6Var, S, i2), 0);
            } else if (nj2.x(previewableHandwritingGesture)) {
                DeleteGesture k = nj2.k(previewableHandwritingGesture);
                deletionArea = k.getDeletionArea();
                n05 S2 = z51.S(deletionArea);
                granularity3 = k.getGranularity();
                if (granularity3 == 1) {
                    i4 = 1;
                }
                o80.A(gi6Var, t80.T(dd6Var, S2, i4), 1);
            } else if (nj2.B(previewableHandwritingGesture)) {
                SelectRangeGesture m = nj2.m(previewableHandwritingGesture);
                selectionStartArea = m.getSelectionStartArea();
                n05 S3 = z51.S(selectionStartArea);
                selectionEndArea = m.getSelectionEndArea();
                n05 S4 = z51.S(selectionEndArea);
                granularity2 = m.getGranularity();
                if (granularity2 != 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                o80.A(gi6Var, t80.V(dd6Var, S3, S4, i), 0);
            } else if (nj2.D(previewableHandwritingGesture)) {
                DeleteRangeGesture l = nj2.l(previewableHandwritingGesture);
                deletionStartArea = l.getDeletionStartArea();
                n05 S5 = z51.S(deletionStartArea);
                deletionEndArea = l.getDeletionEndArea();
                n05 S6 = z51.S(deletionEndArea);
                granularity = l.getGranularity();
                if (granularity == 1) {
                    i4 = 1;
                }
                o80.A(gi6Var, t80.V(dd6Var, S5, S6, i4), 1);
            }
            if (cancellationSignal != null) {
                cancellationSignal.setOnCancelListener(new ot0(gi6Var, (byte) 2));
            }
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            kf r9 = r9.a
            java.lang.Object r9 = r9.E
            h31 r9 = (defpackage.h31) r9
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            r3 = r10 & 2
            if (r3 == 0) goto L15
            r3 = r2
            goto L16
        L15:
            r3 = r1
        L16:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4f
            r5 = r10 & 16
            if (r5 == 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 8
            if (r6 == 0) goto L29
            r6 = r2
            goto L2a
        L29:
            r6 = r1
        L2a:
            r7 = r10 & 4
            if (r7 == 0) goto L30
            r7 = r2
            goto L31
        L30:
            r7 = r1
        L31:
            r8 = 34
            if (r4 < r8) goto L3a
            r10 = r10 & 32
            if (r10 == 0) goto L3a
            r1 = r2
        L3a:
            if (r5 != 0) goto L4c
            if (r6 != 0) goto L4c
            if (r7 != 0) goto L4c
            if (r1 != 0) goto L4c
            if (r4 < r8) goto L49
            r10 = r2
            r1 = r10
        L46:
            r5 = r1
        L47:
            r6 = r5
            goto L52
        L49:
            r10 = r1
            r1 = r2
            goto L46
        L4c:
            r10 = r1
            r1 = r7
            goto L52
        L4f:
            r10 = r1
            r5 = r2
            goto L47
        L52:
            r9.f = r5
            r9.g = r6
            r9.h = r1
            r9.i = r10
            if (r0 == 0) goto L6f
            android.view.inputmethod.CursorAnchorInfo r10 = r9.a()
            if (r10 == 0) goto L6f
            rt3 r0 = r9.c
            android.view.inputmethod.InputMethodManager r1 = r0.E()
            java.lang.Object r0 = r0.y
            android.view.View r0 = (android.view.View) r0
            r1.updateCursorAnchorInfo(r0, r10)
        L6f:
            bx5 r10 = r9.e
            r0 = 0
            if (r3 == 0) goto L8e
            if (r10 == 0) goto L7d
            boolean r10 = r10.isActive()
            if (r10 != r2) goto L7d
            return r2
        L7d:
            v11 r10 = r9.d
            hu1 r1 = new hu1
            r3 = 4
            r1.<init>(r9, r0, r3)
            y11 r3 = defpackage.y11.A
            bx5 r10 = defpackage.tl7.z(r10, r0, r3, r1, r2)
            r9.e = r10
            return r2
        L8e:
            if (r10 == 0) goto L93
            r10.l(r0)
        L93:
            r9.e = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay5.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        rt3 rt3Var = (rt3) this.a.B;
        rt3Var.E().dispatchKeyEventFromInputMethod((View) rt3Var.y, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        kf kfVar = this.a;
        kfVar.f(new vv2(i, i2, kfVar, (byte) 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Spanned spanned;
        pv5 pv5Var;
        q82 q82Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        ArrayList arrayList = null;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        boolean z = false;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj2 : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj2 instanceof BackgroundColorSpan) {
                    pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, w65.e(((BackgroundColorSpan) obj2).getBackgroundColor()), (g96) null, (km5) null, 63487);
                } else if (obj2 instanceof ForegroundColorSpan) {
                    pv5Var = new pv5(w65.e(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65534);
                } else if (obj2 instanceof StrikethroughSpan) {
                    pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, g96.d, (km5) null, 61439);
                } else if (obj2 instanceof StyleSpan) {
                    int style = ((StyleSpan) obj2).getStyle();
                    if (style != 1) {
                        if (style != 2) {
                            if (style == 3) {
                                pv5Var = new pv5(0L, 0L, s92.E, new o92(1), (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65523);
                            }
                            pv5Var = null;
                        } else {
                            pv5Var = new pv5(0L, 0L, (s92) null, new o92(1), (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65527);
                        }
                    } else {
                        pv5Var = new pv5(0L, 0L, s92.E, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65531);
                    }
                } else if (obj2 instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                    String family = typefaceSpan.getFamily();
                    if (a34.i(family, "cursive")) {
                        q82Var = q82.B;
                    } else if (a34.i(family, "monospace")) {
                        q82Var = q82.A;
                    } else if (a34.i(family, "sans-serif")) {
                        q82Var = q82.y;
                    } else if (a34.i(family, "serif")) {
                        q82Var = q82.z;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 != null && family2.length() != 0) {
                            Typeface create = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (a34.i(create, typeface) || a34.i(create, Typeface.create(typeface, 0))) {
                                create = null;
                            }
                            if (create != null) {
                                q82Var = new jj3(new cn7(create));
                            }
                        }
                        q82Var = null;
                    }
                    pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, q82Var, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65503);
                } else {
                    if (obj2 instanceof UnderlineSpan) {
                        pv5Var = new pv5(0L, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, g96.c, (km5) null, 61439);
                    }
                    pv5Var = null;
                }
                if (pv5Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new jo(spanned.getSpanStart(obj2), spanned.getSpanEnd(obj2), pv5Var));
                }
            }
            arrayList = arrayList2;
        }
        this.a.f(new wv2(obj, arrayList, i, z));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        kf kfVar = this.a;
        kfVar.f(new vv2(kfVar, i, i2));
        ((ub2) kfVar.D).invoke(Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.f(new xv2(charSequence.toString(), i, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.f(new wv2(charSequence.toString(), null, i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : textAttribute.isTextSuggestionSelected()));
        return true;
    }
}
