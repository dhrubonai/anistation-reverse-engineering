package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.anistation.android.R;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jy7 {
    public static final zk3 u = new zk3("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final ob4 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final kz i;
    public final Resources j;
    public mw7 k;
    public fk7 l;
    public cb4 m;
    public cb4 n;
    public cb4 o;
    public cb4 p;
    public cb4 q;
    public cb4 r;
    public cb4 s;
    public cb4 t;

    public jy7(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        zk3 zk3Var = xh0.k;
        a34.s();
        xh0 xh0Var = xh0.m;
        a34.x(xh0Var);
        a34.s();
        di0 di0Var = xh0Var.e;
        a34.x(di0Var);
        zh0 zh0Var = di0Var.C;
        a34.x(zh0Var);
        ob4 ob4Var = zh0Var.A;
        a34.x(ob4Var);
        this.c = ob4Var;
        zh0Var.c();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), zh0Var.x);
        String str = ob4Var.A;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = ob4Var.z;
        int dimensionPixelSize = resources.getDimensionPixelSize(ob4Var.O);
        this.i = new kz(context.getApplicationContext(), new tu2(1, dimensionPixelSize, dimensionPixelSize));
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        a48.a(f28.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, hb4, qt0] */
    public final void a() {
        Bitmap bitmap;
        IconCompat iconCompat;
        PendingIntent activities;
        int[] iArr;
        cb4 b;
        IconCompat a;
        q25[] q25VarArr;
        NotificationManager notificationManager = this.b;
        if (notificationManager != null && this.k != null) {
            fk7 fk7Var = this.l;
            if (fk7Var == null || (bitmap = (Bitmap) fk7Var.y) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
                bitmap = null;
            }
            Context context = this.a;
            gb4 gb4Var = new gb4(context, "cast_media_notification");
            if (bitmap == null) {
                iconCompat = null;
            } else {
                iconCompat = new IconCompat(1);
                iconCompat.b = bitmap;
            }
            gb4Var.h = iconCompat;
            ob4 ob4Var = this.c;
            gb4Var.u.icon = ob4Var.B;
            gb4Var.e = gb4.c(this.k.d);
            gb4Var.f = gb4.c(this.j.getString(ob4Var.P, this.k.e));
            gb4Var.d(2, true);
            int i = 0;
            gb4Var.j = false;
            gb4Var.r = true;
            ComponentName componentName = this.e;
            if (componentName == null) {
                activities = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                ArrayList arrayList = new ArrayList();
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(context.getPackageManager());
                }
                if (component != null) {
                    int size = arrayList.size();
                    try {
                        for (Intent F = te4.F(context, component); F != null; F = te4.F(context, F.getComponent())) {
                            arrayList.add(size, F);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(intent);
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
                } else {
                    ze0.m("No intents added to TaskStackBuilder; cannot getPendingIntent");
                    return;
                }
            }
            if (activities != null) {
                gb4Var.g = activities;
            }
            ep7 ep7Var = ob4Var.c0;
            zk3 zk3Var = u;
            if (ep7Var != null) {
                zk3Var.b("actionsProvider != null", new Object[0]);
                int[] b2 = y58.b(ep7Var);
                if (b2 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b2.clone();
                }
                this.g = iArr;
                ArrayList a2 = y58.a(ep7Var);
                this.f = new ArrayList();
                if (a2 != null) {
                    int size2 = a2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj = a2.get(i2);
                        i2++;
                        ab4 ab4Var = (ab4) obj;
                        String str = ab4Var.x;
                        if (!str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) && !str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) && !str.equals(MediaIntentReceiver.ACTION_FORWARD) && !str.equals(MediaIntentReceiver.ACTION_REWIND) && !str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) && !str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                            int i3 = ab4Var.y;
                            String str2 = ab4Var.z;
                            if (i3 == 0) {
                                a = null;
                            } else {
                                a = IconCompat.a(i3);
                            }
                            Bundle bundle = new Bundle();
                            CharSequence c = gb4.c(str2);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            if (!arrayList2.isEmpty()) {
                            }
                            if (arrayList3.isEmpty()) {
                                q25VarArr = null;
                            } else {
                                q25VarArr = (q25[]) arrayList3.toArray(new q25[arrayList3.size()]);
                            }
                            b = new cb4(a, c, broadcast, bundle, q25VarArr, true, true);
                        } else {
                            b = b(str);
                        }
                        if (b != null) {
                            this.f.add(b);
                        }
                    }
                }
            } else {
                zk3Var.b("actionsProvider == null", new Object[0]);
                this.f = new ArrayList();
                ArrayList arrayList4 = ob4Var.x;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList4.get(i4);
                    i4++;
                    cb4 b3 = b((String) obj2);
                    if (b3 != null) {
                        this.f.add(b3);
                    }
                }
                int[] iArr2 = ob4Var.y;
                this.g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList5 = this.f;
            int size4 = arrayList5.size();
            while (i < size4) {
                Object obj3 = arrayList5.get(i);
                i++;
                cb4 cb4Var = (cb4) obj3;
                if (cb4Var != null) {
                    gb4Var.b.add(cb4Var);
                }
            }
            ?? obj4 = new Object();
            obj4.y = null;
            int[] iArr3 = this.g;
            if (iArr3 != null) {
                obj4.y = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = this.k.a;
            if (mediaSessionCompat$Token != null) {
                obj4.z = mediaSessionCompat$Token;
            }
            gb4Var.e(obj4);
            notificationManager.notify("castMediaNotification", 1, gb4Var.b());
        }
    }

    public final cb4 b(String str) {
        IconCompat a;
        PendingIntent pendingIntent;
        IconCompat a2;
        PendingIntent pendingIntent2;
        IconCompat a3;
        IconCompat a4;
        IconCompat a5;
        IconCompat a6;
        int i;
        int i2;
        IconCompat a7;
        IconCompat a8;
        int hashCode = str.hashCode();
        long j = this.h;
        q25[] q25VarArr = null;
        Resources resources = this.j;
        ob4 ob4Var = this.c;
        Context context = this.a;
        ComponentName componentName = this.d;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    cb4 cb4Var = this.r;
                    if (cb4Var == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        zk3 zk3Var = y58.a;
                        int i3 = ob4Var.K;
                        if (j == 10000) {
                            i3 = ob4Var.L;
                        } else if (j == DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS) {
                            i3 = ob4Var.M;
                        }
                        int i4 = ob4Var.Y;
                        if (j == 10000) {
                            i4 = ob4Var.Z;
                        } else if (j == DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS) {
                            i4 = ob4Var.a0;
                        }
                        String string = resources.getString(i4);
                        if (i3 == 0) {
                            a = null;
                        } else {
                            a = IconCompat.a(i3);
                        }
                        Bundle bundle = new Bundle();
                        CharSequence c = gb4.c(string);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (!arrayList.isEmpty()) {
                        }
                        if (!arrayList2.isEmpty()) {
                            q25VarArr = (q25[]) arrayList2.toArray(new q25[arrayList2.size()]);
                        }
                        cb4 cb4Var2 = new cb4(a, c, broadcast, bundle, q25VarArr, true, true);
                        this.r = cb4Var2;
                        return cb4Var2;
                    }
                    return cb4Var;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.k.f;
                    cb4 cb4Var3 = this.o;
                    if (cb4Var3 == null) {
                        if (z) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        } else {
                            pendingIntent = null;
                        }
                        int i5 = ob4Var.F;
                        String string2 = resources.getString(ob4Var.T);
                        if (i5 == 0) {
                            a2 = null;
                        } else {
                            a2 = IconCompat.a(i5);
                        }
                        Bundle bundle2 = new Bundle();
                        CharSequence c2 = gb4.c(string2);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                        }
                        if (!arrayList4.isEmpty()) {
                            q25VarArr = (q25[]) arrayList4.toArray(new q25[arrayList4.size()]);
                        }
                        cb4 cb4Var4 = new cb4(a2, c2, pendingIntent, bundle2, q25VarArr, true, true);
                        this.o = cb4Var4;
                        return cb4Var4;
                    }
                    return cb4Var3;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.k.g;
                    cb4 cb4Var5 = this.p;
                    if (cb4Var5 == null) {
                        if (z2) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        } else {
                            pendingIntent2 = null;
                        }
                        int i6 = ob4Var.G;
                        String string3 = resources.getString(ob4Var.U);
                        if (i6 == 0) {
                            a3 = null;
                        } else {
                            a3 = IconCompat.a(i6);
                        }
                        Bundle bundle3 = new Bundle();
                        CharSequence c3 = gb4.c(string3);
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList5.isEmpty()) {
                        }
                        if (!arrayList6.isEmpty()) {
                            q25VarArr = (q25[]) arrayList6.toArray(new q25[arrayList6.size()]);
                        }
                        cb4 cb4Var6 = new cb4(a3, c3, pendingIntent2, bundle3, q25VarArr, true, true);
                        this.p = cb4Var6;
                        return cb4Var6;
                    }
                    return cb4Var5;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    cb4 cb4Var7 = this.t;
                    if (cb4Var7 == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent4, 67108864);
                        int i7 = ob4Var.N;
                        String string4 = resources.getString(ob4Var.b0);
                        if (i7 == 0) {
                            a4 = null;
                        } else {
                            a4 = IconCompat.a(i7);
                        }
                        Bundle bundle4 = new Bundle();
                        CharSequence c4 = gb4.c(string4);
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        if (!arrayList7.isEmpty()) {
                        }
                        if (!arrayList8.isEmpty()) {
                            q25VarArr = (q25[]) arrayList8.toArray(new q25[arrayList8.size()]);
                        }
                        cb4 cb4Var8 = new cb4(a4, c4, broadcast2, bundle4, q25VarArr, true, true);
                        this.t = cb4Var8;
                        return cb4Var8;
                    }
                    return cb4Var7;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    cb4 cb4Var9 = this.s;
                    if (cb4Var9 == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent5, 67108864);
                        int i8 = ob4Var.N;
                        String string5 = resources.getString(ob4Var.b0, "");
                        if (i8 == 0) {
                            a5 = null;
                        } else {
                            a5 = IconCompat.a(i8);
                        }
                        Bundle bundle5 = new Bundle();
                        CharSequence c5 = gb4.c(string5);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (!arrayList9.isEmpty()) {
                        }
                        if (!arrayList10.isEmpty()) {
                            q25VarArr = (q25[]) arrayList10.toArray(new q25[arrayList10.size()]);
                        }
                        cb4 cb4Var10 = new cb4(a5, c5, broadcast3, bundle5, q25VarArr, true, true);
                        this.s = cb4Var10;
                        return cb4Var10;
                    }
                    return cb4Var9;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    mw7 mw7Var = this.k;
                    int i9 = mw7Var.c;
                    if (mw7Var.b) {
                        cb4 cb4Var11 = this.n;
                        if (cb4Var11 == null) {
                            if (i9 == 2) {
                                i = ob4Var.C;
                                i2 = ob4Var.Q;
                            } else {
                                i = ob4Var.D;
                                i2 = ob4Var.R;
                            }
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent6, 67108864);
                            String string6 = resources.getString(i2);
                            if (i == 0) {
                                a7 = null;
                            } else {
                                a7 = IconCompat.a(i);
                            }
                            Bundle bundle6 = new Bundle();
                            CharSequence c6 = gb4.c(string6);
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            if (!arrayList11.isEmpty()) {
                            }
                            if (!arrayList12.isEmpty()) {
                                q25VarArr = (q25[]) arrayList12.toArray(new q25[arrayList12.size()]);
                            }
                            cb4 cb4Var12 = new cb4(a7, c6, broadcast4, bundle6, q25VarArr, true, true);
                            this.n = cb4Var12;
                            return cb4Var12;
                        }
                        return cb4Var11;
                    }
                    cb4 cb4Var13 = this.m;
                    if (cb4Var13 == null) {
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent7, 67108864);
                        int i10 = ob4Var.E;
                        String string7 = resources.getString(ob4Var.S);
                        if (i10 == 0) {
                            a6 = null;
                        } else {
                            a6 = IconCompat.a(i10);
                        }
                        Bundle bundle7 = new Bundle();
                        CharSequence c7 = gb4.c(string7);
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        if (!arrayList13.isEmpty()) {
                        }
                        if (!arrayList14.isEmpty()) {
                            q25VarArr = (q25[]) arrayList14.toArray(new q25[arrayList14.size()]);
                        }
                        cb4 cb4Var14 = new cb4(a6, c7, broadcast5, bundle7, q25VarArr, true, true);
                        this.m = cb4Var14;
                        return cb4Var14;
                    }
                    return cb4Var13;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    cb4 cb4Var15 = this.q;
                    if (cb4Var15 == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        zk3 zk3Var2 = y58.a;
                        int i11 = ob4Var.H;
                        if (j == 10000) {
                            i11 = ob4Var.I;
                        } else if (j == DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS) {
                            i11 = ob4Var.J;
                        }
                        int i12 = ob4Var.V;
                        if (j == 10000) {
                            i12 = ob4Var.W;
                        } else if (j == DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS) {
                            i12 = ob4Var.X;
                        }
                        String string8 = resources.getString(i12);
                        if (i11 == 0) {
                            a8 = null;
                        } else {
                            a8 = IconCompat.a(i11);
                        }
                        Bundle bundle8 = new Bundle();
                        CharSequence c8 = gb4.c(string8);
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        if (!arrayList15.isEmpty()) {
                        }
                        if (!arrayList16.isEmpty()) {
                            q25VarArr = (q25[]) arrayList16.toArray(new q25[arrayList16.size()]);
                        }
                        cb4 cb4Var16 = new cb4(a8, c8, broadcast6, bundle8, q25VarArr, true, true);
                        this.q = cb4Var16;
                        return cb4Var16;
                    }
                    return cb4Var15;
                }
                break;
        }
        zk3 zk3Var3 = u;
        Log.e(zk3Var3.a, zk3Var3.c("Action: %s is not a pre-defined action.", str));
        return null;
    }
}
