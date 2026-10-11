package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Icon;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.work.impl.foreground.SystemForegroundService;
import com.anistation.android.R;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.cast.MediaInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.zip.Adler32;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dn0 implements jq2, ho0, te2, ue2, l7, xc2, nw4 {
    public static volatile dn0 B;
    public static final Object C = new Object();
    public static final q03 D;
    public static final q03 E;
    public static final q03 F;
    public Object A;
    public final /* synthetic */ byte x;
    public final Object y;
    public Object z;

    static {
        long j = -9223372036854775807L;
        D = new q03(0, j);
        E = new q03(2, j);
        F = new q03(3, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Icon] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.app.Notification$Action$Builder] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.app.Notification$Builder] */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean] */
    public dn0(gb4 gb4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        Icon p0;
        int i;
        Bundle[] bundleArr;
        int i2;
        ?? r11;
        int i3;
        int i4;
        this.x = (byte) 25;
        this.A = new Bundle();
        this.z = gb4Var;
        Context context = gb4Var.a;
        ArrayList arrayList = gb4Var.d;
        Notification.Builder builder = new Notification.Builder(context, gb4Var.s);
        this.y = builder;
        Notification notification = gb4Var.u;
        Context context2 = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i5 = 0;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(gb4Var.e).setContentText(gb4Var.f).setContentInfo(null).setContentIntent(gb4Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(gb4Var.l, gb4Var.m, gb4Var.n);
        IconCompat iconCompat = gb4Var.h;
        if (iconCompat == null) {
            p0 = null;
        } else {
            p0 = db.p0(iconCompat, context);
        }
        builder.setLargeIcon(p0);
        builder.setSubText(null).setUsesChronometer(false).setPriority(gb4Var.i);
        ArrayList arrayList2 = gb4Var.b;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            cb4 cb4Var = (cb4) obj;
            IconCompat iconCompat2 = cb4Var.b;
            if (iconCompat2 == null && (i4 = cb4Var.f) != 0) {
                iconCompat2 = IconCompat.a(i4);
                cb4Var.b = iconCompat2;
            }
            boolean z4 = cb4Var.d;
            Bundle bundle = cb4Var.a;
            if (iconCompat2 != null) {
                r11 = db.p0(iconCompat2, context2);
            } else {
                r11 = context2;
            }
            ?? r16 = context2;
            ?? builder2 = new Notification.Action.Builder((Icon) r11, cb4Var.g, cb4Var.h);
            q25[] q25VarArr = cb4Var.c;
            if (q25VarArr != null) {
                int length = q25VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                i3 = i5;
                if (q25VarArr.length <= 0) {
                    for (int i7 = i3; i7 < length; i7++) {
                        builder2.addRemoteInput(remoteInputArr[i7]);
                    }
                } else {
                    q25 q25Var = q25VarArr[i3];
                    throw r16;
                }
            } else {
                i3 = i5;
            }
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            builder2.setAllowGeneratedReplies(z4);
            ?? r9 = i3;
            bundle2.putInt("android.support.action.semanticAction", r9 == true ? 1 : 0);
            builder2.setSemanticAction(r9 == true ? 1 : 0);
            builder2.setContextual(r9);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                hb.h(builder2);
            }
            if (i8 >= 37) {
                qa.a(builder2);
                qa.c(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", cb4Var.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.y).addAction(builder2.build());
            context2 = r16;
            i5 = 0;
        }
        ?? r162 = context2;
        Bundle bundle3 = gb4Var.q;
        if (bundle3 != null) {
            ((Bundle) this.A).putAll(bundle3);
        }
        ((Notification.Builder) this.y).setShowWhen(gb4Var.j);
        ((Notification.Builder) this.y).setLocalOnly(gb4Var.o);
        ((Notification.Builder) this.y).setGroup(r162);
        ((Notification.Builder) this.y).setSortKey(r162);
        ((Notification.Builder) this.y).setGroupSummary(false);
        ((Notification.Builder) this.y).setCategory(gb4Var.p);
        ((Notification.Builder) this.y).setColor(0);
        ((Notification.Builder) this.y).setVisibility(gb4Var.r ? 1 : 0);
        ((Notification.Builder) this.y).setPublicVersion(null);
        ((Notification.Builder) this.y).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = gb4Var.v;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                ((Notification.Builder) this.y).addPerson((String) obj2);
            }
        }
        if (arrayList.size() > 0) {
            Bundle bundle4 = gb4Var.q;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                gb4Var.q = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                String num = Integer.toString(i10);
                cb4 cb4Var2 = (cb4) arrayList.get(i10);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompat3 = cb4Var2.b;
                if (iconCompat3 == null && (i2 = cb4Var2.f) != 0) {
                    iconCompat3 = IconCompat.a(i2);
                    cb4Var2.b = iconCompat3;
                }
                Bundle bundle9 = cb4Var2.a;
                if (iconCompat3 != null) {
                    i = iconCompat3.b();
                } else {
                    i = 0;
                }
                bundle8.putInt("icon", i);
                bundle8.putCharSequence("title", cb4Var2.g);
                bundle8.putParcelable("actionIntent", cb4Var2.h);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", cb4Var2.d);
                bundle8.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle10);
                q25[] q25VarArr2 = cb4Var2.c;
                if (q25VarArr2 == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[q25VarArr2.length];
                    if (q25VarArr2.length > 0) {
                        q25 q25Var2 = q25VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", cb4Var2.e);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = gb4Var.q;
            Bundle bundle12 = bundle11;
            if (bundle11 == null) {
                Bundle bundle13 = new Bundle();
                gb4Var.q = bundle13;
                bundle12 = bundle13;
            }
            bundle12.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.A).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.y).setExtras(gb4Var.q);
        ((Notification.Builder) this.y).setRemoteInputHistory(null);
        ((Notification.Builder) this.y).setBadgeIconType(0);
        ((Notification.Builder) this.y).setSettingsText(null);
        ((Notification.Builder) this.y).setShortcutId(null);
        ((Notification.Builder) this.y).setTimeoutAfter(0L);
        ((Notification.Builder) this.y).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(gb4Var.s)) {
            ((Notification.Builder) this.y).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = gb4Var.c.iterator();
        if (!it.hasNext()) {
            ((Notification.Builder) this.y).setAllowSystemGeneratedContextualActions(gb4Var.t);
            ((Notification.Builder) this.y).setBubbleMetadata(null);
            if (Build.VERSION.SDK_INT >= 36) {
                e4.e((Notification.Builder) this.y);
                return;
            }
            return;
        }
        throw qx1.f(it);
    }

    public static dn0 A(Context context) {
        if (B == null) {
            synchronized (C) {
                try {
                    if (B == null) {
                        B = new dn0(context);
                    }
                } finally {
                }
            }
        }
        return B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(defpackage.rs1 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.C(rs1, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean G(String str) {
        Object y45Var;
        String host;
        try {
            URI uri = new URI(str);
            boolean z = true;
            if (!b06.C(uri.getScheme(), HttpRequest.DEFAULT_SCHEME, true) || (host = uri.getHost()) == null || uz5.V(host)) {
                z = false;
            }
            y45Var = Boolean.valueOf(z);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Object obj = Boolean.FALSE;
        if (y45Var instanceof y45) {
            y45Var = obj;
        }
        return ((Boolean) y45Var).booleanValue();
    }

    public static String U(String str) {
        String obj = uz5.w0(str).toString();
        Pattern compile = Pattern.compile("\\s+");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll(" ");
        replaceAll.getClass();
        return uz5.u0(128, replaceAll);
    }

    public static fg5 u(Class cls, te0 te0Var) {
        try {
            return (fg5) cls.getConstructor(te0.class).newInstance(te0Var);
        } catch (Exception e) {
            throw new IllegalStateException("Downloader factory missing", e);
        }
    }

    public static boolean v(Editable editable, KeyEvent keyEvent, boolean z) {
        hl6[] hl6VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (hl6VarArr = (hl6[]) editable.getSpans(selectionStart, selectionEnd, hl6.class)) != null && hl6VarArr.length > 0) {
                for (hl6 hl6Var : hl6VarArr) {
                    int spanStart = editable.getSpanStart(hl6Var);
                    int spanEnd = editable.getSpanEnd(hl6Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long B() {
        return ((xg0) this.A).x.d;
    }

    public boolean D(CharSequence charSequence, int i, int i2, gl6 gl6Var) {
        int i3;
        if ((gl6Var.c & 3) == 0) {
            u81 u81Var = (u81) this.A;
            iy3 b = gl6Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.A).getShort(a + b.x);
            }
            u81Var.getClass();
            ThreadLocal threadLocal = u81.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = u81Var.a.hasGlyph(sb.toString());
            int i4 = gl6Var.c & 4;
            if (hasGlyph) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            gl6Var.c = i3;
        }
        if ((gl6Var.c & 3) != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r1.A != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r1.A != r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(defpackage.q41 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.nv4 r15) {
        /*
            r7 = this;
            p81 r1 = new p81
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.A = r1
            java.lang.Object r8 = r7.z
            b12 r8 = (defpackage.b12) r8
            if (r8 == 0) goto L11
            return
        L11:
            java.lang.Object r8 = r7.y
            e12 r8 = (defpackage.e12) r8
            b12[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            jw2 r10 = defpackage.nw2.m(r10)
            int r11 = r8.length
            r12 = 1
            r13 = 0
            if (r11 != r12) goto L29
            r8 = r8[r13]
            r7.z = r8
            goto L85
        L29:
            int r11 = r8.length
            r14 = r13
        L2b:
            if (r14 >= r11) goto L7e
            r0 = r8[r14]
            boolean r2 = r0.b(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            if (r2 == 0) goto L3d
            r7.z = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r1.C = r13
            goto L7e
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5a
        L3d:
            java.util.List r0 = r0.d()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            r10.d(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6e
            java.lang.Object r0 = r7.z
            b12 r0 = (defpackage.b12) r0
            if (r0 != 0) goto L53
            long r5 = r1.A
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r13
            goto L54
        L53:
            r0 = r12
        L54:
            defpackage.io3.B(r0)
            r1.C = r13
            goto L7b
        L5a:
            java.lang.Object r7 = r7.z
            b12 r7 = (defpackage.b12) r7
            if (r7 != 0) goto L68
            long r9 = r1.A
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 != 0) goto L67
            goto L68
        L67:
            r12 = r13
        L68:
            defpackage.io3.B(r12)
            r1.C = r13
            throw r8
        L6e:
            java.lang.Object r0 = r7.z
            b12 r0 = (defpackage.b12) r0
            if (r0 != 0) goto L53
            long r5 = r1.A
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7b:
            int r14 = r14 + 1
            goto L2b
        L7e:
            java.lang.Object r7 = r7.z
            b12 r7 = (defpackage.b12) r7
            if (r7 == 0) goto L89
            r8 = r7
        L85:
            r8.e(r15)
            return
        L89:
            lo6 r7 = new lo6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            tv r12 = new tv
            r14 = 2
            java.lang.String r15 = ", "
            r12.<init>(r15, r14)
            o15 r8 = defpackage.nw2.p(r8)
            pb0 r14 = new pb0
            r14.<init>(r13)
            java.util.AbstractList r8 = defpackage.tl7.S(r8, r14)
            java.lang.String r8 = r12.d(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            o15 r9 = r10.g()
            r7.<init>(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.E(q41, android.net.Uri, java.util.Map, long, long, nv4):void");
    }

    public boolean F() {
        if (((lj3) this.z) != null) {
            return true;
        }
        return false;
    }

    public fg5 H(int i, te0 te0Var) {
        fg5 u;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    u = u(pl2.class.asSubclass(fg5.class), te0Var);
                } else {
                    ze0.k(qx1.h(i, "Unsupported type: "));
                    return null;
                }
            } else {
                u = u(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(fg5.class), te0Var);
            }
        } else {
            u = u(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader$Factory").asSubclass(fg5.class), te0Var);
        }
        ((SparseArray) this.A).put(i, u);
        return u;
    }

    public void I(List list, ur3[] ur3VarArr) {
        for (int i = 0; i < list.size(); i++) {
            HashMap hashMap = (HashMap) this.A;
            MediaInfo mediaInfo = ur3VarArr[i].x;
            mediaInfo.getClass();
            hashMap.put(mediaInfo.c(), (ar3) list.get(i));
        }
    }

    public void J(dg3 dg3Var) {
        xj5 xj5Var = (xj5) this.A;
        if (xj5Var != null) {
            xj5Var.run();
        }
        xj5 xj5Var2 = new xj5((rg3) this.y, dg3Var);
        this.A = xj5Var2;
        ((Handler) this.z).postAtFrontOfQueue(xj5Var2);
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, vs1 vs1Var) {
        int i4;
        char c;
        xs1 xs1Var = new xs1((my3) ((zp2) this.z).z);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                my3 my3Var = (my3) xs1Var.c.a.get(codePointAt);
                if (xs1Var.a != 2) {
                    if (my3Var == null) {
                        xs1Var.a();
                        c = 1;
                    } else {
                        xs1Var.a = (byte) 2;
                        xs1Var.c = my3Var;
                        xs1Var.f = 1;
                        c = 2;
                    }
                } else {
                    if (my3Var != null) {
                        xs1Var.c = my3Var;
                        xs1Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            xs1Var.a();
                        } else if (codePointAt != 65039) {
                            my3 my3Var2 = xs1Var.c;
                            if (my3Var2.b != null) {
                                if (xs1Var.f == 1) {
                                    if (xs1Var.b()) {
                                        xs1Var.d = xs1Var.c;
                                        xs1Var.a();
                                    } else {
                                        xs1Var.a();
                                    }
                                } else {
                                    xs1Var.d = my3Var2;
                                    xs1Var.a();
                                }
                                c = 3;
                            } else {
                                xs1Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                xs1Var.e = codePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            if (z || !D(charSequence, i4, i6, xs1Var.d.b)) {
                                z2 = vs1Var.c(charSequence, i4, i6, xs1Var.d.b);
                                i5++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i6;
                        if (charCount < i2) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i6 = charCount;
                    }
                } else {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                }
            }
        }
        if (xs1Var.a == 2 && xs1Var.c.b != null && ((xs1Var.f > 1 || xs1Var.b()) && i5 < i3 && z2 && (z || !D(charSequence, i4, i6, xs1Var.c.b)))) {
            vs1Var.c(charSequence, i4, i6, xs1Var.c.b);
        }
        return vs1Var.b();
    }

    public void L(nj3 nj3Var) {
        l04 l04Var = (l04) this.y;
        lj3 lj3Var = (lj3) this.z;
        if (lj3Var != null) {
            lj3Var.a(true);
        }
        if (nj3Var != null) {
            l04Var.execute(new la((Object) nj3Var, (byte) 4));
        }
        ((qi2) l04Var.z).accept(l04Var.y);
    }

    public void M(k7 k7Var) {
        cp4 cp4Var = (cp4) ((HashMap) this.y).remove(k7Var);
        cp4Var.getClass();
        q91 q91Var = (q91) ((r91) this.A).p.get(cp4Var);
        if (q91Var != null) {
            synchronized (q91Var) {
                q91Var.d--;
            }
        }
    }

    public void N(oy oyVar, int i, boolean z) {
        Long l;
        ky kyVar = (ky) this.A;
        Context context = (Context) this.y;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = oyVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        cu4 cu4Var = oyVar.c;
        adler32.update(allocate.putInt(du4.a(cu4Var)).array());
        byte[] bArr = oyVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        h98.n(oyVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((l85) this.z).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(du4.a(cu4Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(kyVar.a(cu4Var, longValue, i));
            Set set = ((ly) kyVar.b.get(cu4Var)).c;
            if (set.contains(ub5.x)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ub5.z)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ub5.y)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, du4.a(cu4Var));
            if (bArr != null) {
                persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.JobInfoScheduler", String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oyVar, Integer.valueOf(value), Long.valueOf(kyVar.a(cu4Var, longValue, i)), l, Integer.valueOf(i)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void O(Object obj) {
        long c = nz5.c();
        if (c == se6.a) {
            this.A = obj;
            return;
        }
        synchronized (this.z) {
            oe6 oe6Var = (oe6) ((AtomicReference) this.y).get();
            int a = oe6Var.a(c);
            if (a < 0) {
                ((AtomicReference) this.y).set(oe6Var.b(c, obj));
            } else {
                oe6Var.c[a] = obj;
            }
        }
    }

    public void P(vg0 vg0Var) {
        ((xg0) this.A).x.c = vg0Var;
    }

    public void Q(ud1 ud1Var) {
        ((xg0) this.A).x.a = ud1Var;
    }

    public void R(ia3 ia3Var) {
        ((xg0) this.A).x.b = ia3Var;
    }

    public void S(long j) {
        ((xg0) this.A).x.d = j;
    }

    public void T(mj3 mj3Var, kj3 kj3Var, int i) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.A = null;
        lj3 lj3Var = new lj3(this, myLooper, mj3Var, kj3Var, i, SystemClock.elapsedRealtime());
        if (((lj3) this.z) == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        this.z = lj3Var;
        lj3Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r14.equals(r3.d) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(int r17, defpackage.ar3 r18, com.google.android.gms.cast.MediaInfo r19, java.lang.String r20, long r21) {
        /*
            r16 = this;
            r0 = r17
            r1 = r19
            r2 = r16
            java.lang.Object r2 = r2.y
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            oi0 r3 = defpackage.oi0.f
            java.lang.Object r3 = r2.get(r0, r3)
            oi0 r3 = (defpackage.oi0) r3
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L1b
        L19:
            r6 = r4
            goto L27
        L1b:
            long r6 = r1.B
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L19
            long r6 = defpackage.eq6.U(r6)
        L27:
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L2d
            long r6 = r3.a
        L2d:
            r9 = r6
            if (r1 != 0) goto L34
            boolean r1 = r3.c
        L32:
            r13 = r1
            goto L3d
        L34:
            int r1 = r1.y
            r6 = 2
            if (r1 != r6) goto L3b
            r1 = 1
            goto L32
        L3b:
            r1 = 0
            goto L32
        L3d:
            int r1 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r1 != 0) goto L45
            long r4 = r3.b
            r11 = r4
            goto L47
        L45:
            r11 = r21
        L47:
            ar3 r1 = defpackage.ar3.g
            r4 = r18
            if (r4 != r1) goto L51
            ar3 r1 = r3.d
            r14 = r1
            goto L52
        L51:
            r14 = r4
        L52:
            long r4 = r3.a
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 != 0) goto L75
            long r4 = r3.b
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto L75
            boolean r1 = r3.c
            if (r13 != r1) goto L75
            java.lang.String r1 = r3.e
            r15 = r20
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L77
            ar3 r1 = r3.d
            boolean r1 = r14.equals(r1)
            if (r1 == 0) goto L77
            goto L7d
        L75:
            r15 = r20
        L77:
            oi0 r8 = new oi0
            r8.<init>(r9, r11, r13, r14, r15)
            r3 = r8
        L7d:
            r2.put(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.V(int, ar3, com.google.android.gms.cast.MediaInfo, java.lang.String, long):void");
    }

    @Override // defpackage.l7
    public synchronized void a(g90 g90Var) {
        ((r91) this.A).c.a(g90Var);
        while (g90Var != null) {
            k7 k7Var = (k7) g90Var.z;
            k7Var.getClass();
            M(k7Var);
            g90Var = (g90) g90Var.A;
            if (g90Var == null || ((k7) g90Var.z) == null) {
                g90Var = null;
            }
        }
    }

    @Override // defpackage.ho0
    public p71 b(ea2 ea2Var, LogSessionId logSessionId) {
        p71 b = ((ho0) this.y).b(ea2Var, logSessionId);
        this.z = b.d.getCanonicalName();
        return b;
    }

    @Override // defpackage.ho0
    public boolean c() {
        return ((ho0) this.y).c();
    }

    @Override // defpackage.l7
    public synchronized void d(k7 k7Var) {
        ((r91) this.A).c.d(k7Var);
        M(k7Var);
    }

    @Override // defpackage.jq2
    public void e(Object obj, wp2 wp2Var) {
        en0 en0Var = (en0) obj;
        en0Var.getClass();
        cn0 cn0Var = new cn0(en0Var.x, wp2Var, en0Var.y);
        en0Var.z.invoke(cn0Var);
        en0Var.A = cn0Var.d;
        ArrayList arrayList = cn0Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            sn2 sn2Var = (sn2) obj2;
            sn2Var.getClass();
            sn2Var.a.f(wp2Var, sn2Var.b);
        }
    }

    @Override // defpackage.ue2
    public synchronized void f() {
        ((jh6) this.z).f();
    }

    @Override // defpackage.l7
    public synchronized k7 g() {
        k7 g;
        g = ((r91) this.A).c.g();
        ((HashMap) this.y).put(g, (cp4) this.z);
        q91 q91Var = (q91) ((r91) this.A).p.get((cp4) this.z);
        if (q91Var != null) {
            synchronized (q91Var) {
                q91Var.d++;
            }
        }
        return g;
    }

    @Override // defpackage.nw4
    public Object get() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 27:
                return new dn0(((nw4) obj).get(), ((nw4) this.z).get(), ((xb5) this.A).get(), (byte) 21);
            default:
                long c = nz5.c();
                if (c == se6.a) {
                    return this.A;
                }
                oe6 oe6Var = (oe6) ((AtomicReference) obj).get();
                int a = oe6Var.a(c);
                if (a >= 0) {
                    return oe6Var.c[a];
                }
                return null;
        }
    }

    @Override // defpackage.jq2
    public ou getKey() {
        return (ou) this.A;
    }

    @Override // defpackage.te2
    public synchronized void h() {
        ((jh6) this.z).h();
    }

    @Override // defpackage.l7
    public synchronized void i() {
        ((r91) this.A).c.i();
    }

    @Override // defpackage.ho0
    public boolean j() {
        return ((ho0) this.y).j();
    }

    @Override // defpackage.te2
    public void k(we2 we2Var) {
        ((ts6) this.A).f(new fj0(this, we2Var, (byte) 0), true);
    }

    @Override // defpackage.jq2
    public Object l(ub2 ub2Var) {
        Object invoke = ((sb2) this.y).invoke();
        ub2Var.invoke(invoke);
        return new en0((ou) this.A, invoke, (ub2) this.z);
    }

    @Override // defpackage.ho0
    public p71 m(ea2 ea2Var, LogSessionId logSessionId) {
        p71 m = ((ho0) this.y).m(ea2Var, logSessionId);
        this.A = m.d.getCanonicalName();
        return m;
    }

    @Override // defpackage.ue2
    public synchronized void n(we2 we2Var, long j) {
        ((jh6) this.z).e(we2Var, j);
    }

    @Override // defpackage.l7
    public synchronized int o() {
        ((r91) this.A).c.getClass();
        return 65536;
    }

    @Override // defpackage.xc2
    public void onSuccess(Object obj) {
        bt3 bt3Var = (bt3) obj;
        List list = (List) ((wu3) this.A).h.remove((xu3) this.y);
        if (!((wu3) this.A).i.i() && bt3Var != null) {
            st3 st3Var = ((wu3) this.A).f;
            dt3 dt3Var = (dt3) this.z;
            st3Var.d(dt3Var.a, dt3Var, bt3Var.a, bt3Var.b);
            bu3 bu3Var = ((wu3) this.A).i;
            dt3 dt3Var2 = (dt3) this.z;
            if (!bu3Var.y || !bu3.j(dt3Var2)) {
                bu3Var.e.getClass();
            }
            wu3 wu3Var = (wu3) this.A;
            fu fuVar = wu3Var.l;
            dt3 dt3Var3 = (dt3) this.z;
            long j = wu3Var.t;
            fuVar.removeMessages(1001, dt3Var3);
            fuVar.sendMessageDelayed(fuVar.obtainMessage(1001, dt3Var3), j);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((vu3) it.next()).a((dt3) this.z);
                    } catch (RemoteException e) {
                        kb0.P("MediaSessionLegacyStub", "Exception in " + ((dt3) this.z), e);
                    }
                }
            }
        }
    }

    public void p() {
        lj3 lj3Var = (lj3) this.z;
        lj3Var.getClass();
        lj3Var.a(false);
    }

    @Override // defpackage.te2
    public synchronized void q() {
        ((jh6) this.z).q();
        ts6 ts6Var = (ts6) this.A;
        ve2 ve2Var = (ve2) this.y;
        Objects.requireNonNull(ve2Var);
        ts6Var.f(new gj0(ve2Var, (byte) 0), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r0.b(r1) == r7) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v2, types: [ub2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [ub2] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, mu5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.ny2 r11, defpackage.pb r12, defpackage.xz0 r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.r(ny2, pb, xz0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [qq3, pq3] */
    public cm1 s(il1 il1Var) {
        fg5 H;
        cm1 ql2Var;
        vq3 vq3Var;
        long j;
        long j2;
        byte b = this.x;
        Object obj = this.y;
        sq3 sq3Var = null;
        Map<String, String> map = null;
        switch (b) {
            case 14:
                ExecutorService executorService = (ExecutorService) this.z;
                te0 te0Var = (te0) obj;
                Uri uri = il1Var.y;
                String str = il1Var.C;
                int L = eq6.L(uri, il1Var.z);
                if (L != 0) {
                    boolean z = true;
                    if (L != 1 && L != 2) {
                        if (L == 4) {
                            gl1 gl1Var = il1Var.E;
                            oq3 oq3Var = new oq3();
                            rq3 rq3Var = new rq3();
                            List list = Collections.EMPTY_LIST;
                            z62 z62Var = nw2.y;
                            o15 o15Var = o15.B;
                            tq3 tq3Var = new tq3();
                            wq3 wq3Var = wq3.d;
                            if (((Uri) rq3Var.e) != null && ((UUID) rq3Var.d) == null) {
                                z = false;
                            }
                            io3.B(z);
                            if (uri != null) {
                                if (((UUID) rq3Var.d) != null) {
                                    sq3Var = new sq3(rq3Var);
                                }
                                vq3Var = new vq3(uri, null, sq3Var, null, list, str, o15Var, -9223372036854775807L);
                            } else {
                                vq3Var = null;
                            }
                            ar3 ar3Var = new ar3("", new pq3(oq3Var), vq3Var, new uq3(tq3Var), jr3.M, wq3Var);
                            if (gl1Var != null) {
                                j = gl1Var.x;
                            } else {
                                j = 0;
                            }
                            long j3 = j;
                            if (gl1Var != null) {
                                j2 = gl1Var.y;
                            } else {
                                j2 = -1;
                            }
                            ql2Var = new gv4(ar3Var, te0Var, executorService, j3, j2);
                            return ql2Var;
                        }
                        ze0.k(qx1.h(L, "Unsupported type: "));
                        return null;
                    }
                }
                SparseArray sparseArray = (SparseArray) this.A;
                if (sparseArray.indexOfKey(L) >= 0) {
                    H = (fg5) sparseArray.get(L);
                } else {
                    try {
                        H = H(L, te0Var);
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException(qx1.h(L, "Module missing for content type "), e);
                    }
                }
                nq3 nq3Var = new nq3();
                nq3Var.e = uri;
                nq3Var.b(il1Var.A);
                nq3Var.d = str;
                ar3 a = nq3Var.a();
                hl1 hl1Var = il1Var.F;
                if (hl1Var != null) {
                    pl2 pl2Var = (pl2) H;
                    pl2Var.d = hl1Var.x;
                    pl2Var.e = hl1Var.y;
                }
                pl2 pl2Var2 = (pl2) H;
                pl2Var2.getClass();
                ql2Var = new ql2(a, pl2Var2.b, pl2Var2.a, executorService, pl2Var2.c, pl2Var2.d, pl2Var2.e);
                return ql2Var;
            default:
                il1Var.getClass();
                x53 x53Var = jk1.a;
                byte[] bArr = il1Var.D;
                bArr.getClass();
                OfflineDownloadMetadata a2 = jk1.a(bArr);
                l33 l33Var = new l33((jd4) this.z);
                if (a2 != null) {
                    map = a2.getHeaders();
                }
                if (map == null) {
                    map = ot1.x;
                }
                l33Var.o(map);
                te0 te0Var2 = new te0();
                te0Var2.x = (lp5) obj;
                te0Var2.A = l33Var;
                return new dn0(te0Var2, (ExecutorService) this.A).s(il1Var);
        }
    }

    @Override // defpackage.xc2
    public void t(Throwable th) {
        wu3 wu3Var = (wu3) this.A;
        js jsVar = wu3Var.g;
        xu3 xu3Var = (xu3) this.y;
        wu3Var.h.remove(xu3Var);
    }

    public String toString() {
        switch (this.x) {
            case 24:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.y);
                sb.append('{');
                l33 l33Var = (l33) ((l33) this.z).z;
                String str = "";
                while (l33Var != null) {
                    Object obj = l33Var.y;
                    sb.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    l33Var = (l33) l33Var.z;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void w(Bundle bundle) {
        HashSet hashSet = (HashSet) this.z;
        String string = ((Context) this.A).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (yy2.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    x((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new er0(e);
            }
        }
    }

    public Object x(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.y;
        if (qg6.a()) {
            try {
                Trace.beginSection(it5.f(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    yy2 yy2Var = (yy2) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> dependencies = yy2Var.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class cls2 : dependencies) {
                            if (!hashMap.containsKey(cls2)) {
                                x(cls2, hashSet);
                            }
                        }
                    }
                    obj = yy2Var.create((Context) this.A);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th) {
                    throw new er0(th);
                }
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }

    public vg0 y() {
        return ((xg0) this.A).x.c;
    }

    public long z() {
        p81 p81Var = (p81) this.A;
        if (p81Var != null) {
            return p81Var.A;
        }
        return -1L;
    }

    public /* synthetic */ dn0(Object obj, Object obj2, Object obj3, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public dn0(p5 p5Var, int i) {
        this.x = (byte) 12;
        this.y = p5Var;
        int i2 = hi5.a;
        this.z = new fi5(i);
        this.A = new lv0();
    }

    public dn0(SystemForegroundService systemForegroundService) {
        this.x = (byte) 28;
        this.y = new rg3(systemForegroundService, true);
        this.z = new Handler(Looper.getMainLooper());
    }

    public dn0(br3 br3Var) {
        this.x = (byte) 9;
        this.z = br3Var;
        this.y = new SparseArray();
        this.A = new HashMap();
    }

    public dn0(oe2 oe2Var, ve2 ve2Var, ve2 ve2Var2, ts6 ts6Var) {
        this.x = (byte) 10;
        io3.p(ve2Var != ve2Var2, "Creating a self loop in the chain: %s", ve2Var);
        this.y = ve2Var;
        this.z = new jh6(oe2Var, ve2Var2, ts6Var);
        this.A = ts6Var;
    }

    public dn0(View view) {
        this.x = (byte) 20;
        this.y = view;
        this.z = bx7.B(jf3.z, new vt0(this, (byte) 13));
        this.A = new fq3(view);
    }

    public dn0(String str, sb2 sb2Var, ub2 ub2Var) {
        al6 al6Var;
        this.x = (byte) 0;
        sb2Var.getClass();
        this.y = sb2Var;
        this.z = ub2Var;
        im0 a = z05.a(en0.class);
        try {
            a83 a83Var = a83.c;
            im0 a2 = z05.a(dn0.class);
            z05.a.getClass();
            yk6 yk6Var = new yk6(a2);
            z05.b(yk6Var, z05.c(Object.class));
            List list = Collections.EMPTY_LIST;
            list.getClass();
            al6Var = z05.d(en0.class, sw0.y(new al6(yk6Var, list, 0)));
        } catch (Throwable unused) {
            al6Var = null;
        }
        this.A = new ou(str, new vk6(a, false, al6Var));
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, xa6] */
    public dn0(byte b) {
        this.x = b;
        switch (b) {
            case 16:
                this.y = dh1.x;
                String obj = uz5.w0("https://cdn.discordapp.com/app-assets/1543212125684764693/1543233570112409681.png").toString();
                this.z = obj.length() == 0 ? "logo" : obj;
                String obj2 = uz5.w0("https://cdn.discordapp.com/app-assets/1543212125684764693/1552400121600151634.png").toString();
                this.A = (obj2 == null || !G(obj2)) ? null : obj2;
                return;
            case 18:
                this.y = new p44();
                return;
            case 26:
                long[] jArr = cb5.a;
                this.y = new p44();
                return;
            case 29:
                this.y = new AtomicReference(a34.u);
                this.z = new Object();
                return;
            default:
                ?? obj3 = new Object();
                obj3.a = Float.NaN;
                this.y = obj3;
                this.z = new Object();
                return;
        }
    }

    public /* synthetic */ dn0(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    public dn0(te0 te0Var, ExecutorService executorService) {
        this.x = (byte) 14;
        this.y = te0Var;
        this.z = executorService;
        this.A = new SparseArray();
    }

    public dn0(xg0 xg0Var) {
        this.x = (byte) 7;
        this.A = xg0Var;
        this.y = new af2((Object) this, (byte) 11);
    }

    public dn0(Context context) {
        this.x = (byte) 1;
        this.A = context.getApplicationContext();
        this.z = new HashSet();
        this.y = new HashMap();
    }

    public dn0(zp2 zp2Var, p18 p18Var, u81 u81Var, Set set) {
        this.x = (byte) 17;
        this.y = p18Var;
        this.z = zp2Var;
        this.A = u81Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new tv(str, (char) 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [f30, ro5, java.lang.Object] */
    public dn0(zv[] zvVarArr) {
        this.x = (byte) 13;
        ?? f30Var = new f30();
        f30Var.m = 0;
        f30Var.o = 0;
        f30Var.p = 0;
        byte[] bArr = eq6.b;
        f30Var.n = bArr;
        f30Var.q = bArr;
        xu5 xu5Var = new xu5(false);
        zv[] zvVarArr2 = new zv[zvVarArr.length + 2];
        this.y = zvVarArr2;
        System.arraycopy(zvVarArr, 0, zvVarArr2, 0, zvVarArr.length);
        this.z = f30Var;
        this.A = xu5Var;
        zvVarArr2[zvVarArr.length] = f30Var;
        zvVarArr2[zvVarArr.length + 1] = xu5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dn0(java.lang.String r4, byte r5) {
        /*
            r3 = this;
            r3.x = r5
            switch(r5) {
                case 24: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = "ExoPlayer:Loader:"
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = defpackage.eq6.a
            fv0 r5 = new fv0
            r0 = 2
            r5.<init>(r4, r0)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r5)
            qi2 r5 = new qi2
            r1 = 10
            r5.<init>(r1)
            l04 r1 = new l04
            r2 = 1
            r1.<init>(r4, r5, r2)
            r3.<init>(r1, r0)
            return
        L28:
            r3.<init>()
            l33 r5 = new l33
            r0 = 5
            r1 = 0
            r5.<init>(r0, r1)
            r3.z = r5
            r3.A = r5
            r3.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.<init>(java.lang.String, byte):void");
    }

    public dn0(ww wwVar) {
        this.x = (byte) 5;
        this.A = wwVar;
        Handler p = eq6.p(null);
        this.y = p;
        vw vwVar = new vw(this);
        this.z = vwVar;
        wwVar.a.registerStreamEventCallback(new uw(p, (byte) 0), vwVar);
    }

    public dn0(wu3 wu3Var, xu3 xu3Var, tu3 tu3Var, dt3 dt3Var) {
        this.x = (byte) 23;
        this.A = wu3Var;
        this.y = xu3Var;
        this.z = dt3Var;
    }

    public dn0(r91 r91Var, cp4 cp4Var) {
        this.x = (byte) 15;
        this.A = r91Var;
        this.y = new HashMap();
        this.z = cp4Var;
    }
}
