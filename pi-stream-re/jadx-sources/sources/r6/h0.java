package r6;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;
import java.util.logging.Logger;
import msr.pistream.app.R;
import msr.pistream.app.download.PiStreamDownloadService;
import msr.pistream.app.ui.home.screens.MainActivity;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f9469a = "";

    /* renamed from: b, reason: collision with root package name */
    public static final e4.q f9470b = new e4.q();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f9471c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Method f9472d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9473e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Field f9474f;

    public h0() {
    }

    public static final void A(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                com.bumptech.glide.d.a(th, th2);
            }
        }
    }

    public static void A0(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
    }

    public static int B(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static void B0(Context context, ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a8.b bVar = (a8.b) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                String str = bVar.f168a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("title", str);
                String str3 = bVar.f169b;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("url", str3);
                String str4 = bVar.f170c;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject.put("thumbnail", str4);
                String str5 = bVar.A;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("banner", str5);
                String str6 = bVar.f171d;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("description", str6);
                String str7 = bVar.f172e;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("genres", str7);
                String str8 = bVar.f173f;
                if (str8 == null) {
                    str8 = "";
                }
                jSONObject.put("studio", str8);
                String str9 = bVar.f174x;
                if (str9 == null) {
                    str9 = "";
                }
                jSONObject.put("episode", str9);
                String str10 = bVar.G;
                if (str10 == null) {
                    str10 = "";
                }
                jSONObject.put("episodeName", str10);
                String str11 = bVar.F;
                if (str11 == null) {
                    str11 = "";
                }
                jSONObject.put("episodeUrl", str11);
                String str12 = bVar.f175y;
                if (str12 == null) {
                    str12 = "";
                }
                jSONObject.put("quality", str12);
                String str13 = bVar.f176z;
                if (str13 == null) {
                    str13 = "";
                }
                jSONObject.put("year", str13);
                String str14 = bVar.B;
                if (str14 == null) {
                    str14 = "";
                }
                jSONObject.put("status", str14);
                String str15 = bVar.C;
                if (str15 == null) {
                    str15 = "";
                }
                jSONObject.put("rating", str15);
                String str16 = bVar.D;
                if (str16 != null) {
                    str2 = str16;
                }
                jSONObject.put("playbackId", str2);
                jSONObject.put("positionMs", bVar.H);
                jSONObject.put("durationMs", bVar.I);
                jSONObject.put("percent", bVar.J);
                jSONObject.put("updatedAt", bVar.K);
            } catch (Exception e10) {
                Log.e("ContinueWatchingStore", "exception", e10);
            }
            jSONArray.put(jSONObject);
        }
        context.getApplicationContext().getSharedPreferences("pistream_continue_watching", 0).edit().putString("items", jSONArray.toString()).apply();
    }

    public static e4.d C(y3.d dVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z9 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                }
            } else if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i10 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i11 = current.getIntrinsicHeight();
                }
                Lock lock = e4.y.f3535b;
                lock.lock();
                Bitmap b10 = dVar.b(i10, i11, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(b10);
                    current.setBounds(0, 0, i10, i11);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = b10;
                    z9 = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            bitmap = null;
            z9 = true;
        } else {
            bitmap = null;
        }
        if (!z9) {
            dVar = f9470b;
        }
        return e4.d.c(bitmap, dVar);
    }

    public static void C0(Context context, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w7.d dVar = (w7.d) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("query", dVar.f11043a);
                JSONObject jSONObject2 = new JSONObject();
                a8.b bVar = dVar.f11044b;
                if (bVar == null) {
                    bVar = new a8.b();
                }
                String str = bVar.f168a;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject2.put("title", str);
                String str3 = bVar.f169b;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject2.put("url", str3);
                String str4 = bVar.f170c;
                if (str4 == null) {
                    str4 = "";
                }
                jSONObject2.put("thumbnail", str4);
                String str5 = bVar.f171d;
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject2.put("description", str5);
                String str6 = bVar.f172e;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject2.put("genres", str6);
                String str7 = bVar.f173f;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject2.put("studio", str7);
                String str8 = bVar.f174x;
                if (str8 == null) {
                    str8 = "";
                }
                jSONObject2.put("episode", str8);
                String str9 = bVar.f175y;
                if (str9 == null) {
                    str9 = "";
                }
                jSONObject2.put("quality", str9);
                String str10 = bVar.f176z;
                if (str10 == null) {
                    str10 = "";
                }
                jSONObject2.put("year", str10);
                String str11 = bVar.A;
                if (str11 == null) {
                    str11 = "";
                }
                jSONObject2.put("banner", str11);
                String str12 = bVar.B;
                if (str12 == null) {
                    str12 = "";
                }
                jSONObject2.put("status", str12);
                String str13 = bVar.C;
                if (str13 == null) {
                    str13 = "";
                }
                jSONObject2.put("rating", str13);
                String str14 = bVar.D;
                if (str14 != null) {
                    str2 = str14;
                }
                jSONObject2.put("playbackId", str2);
                jSONObject.put("item", jSONObject2);
            } catch (Exception e10) {
                Log.e("SearchHistoryStore", "exception", e10);
            }
            jSONArray.put(jSONObject);
        }
        context.getApplicationContext().getSharedPreferences("pistream_search_history", 0).edit().putString("entries", jSONArray.toString()).apply();
    }

    public static a8.b D(a8.b bVar) {
        a8.b bVar2 = new a8.b();
        bVar2.f168a = bVar.f168a;
        bVar2.f169b = bVar.f169b;
        bVar2.f170c = bVar.f170c;
        bVar2.A = bVar.A;
        bVar2.f171d = bVar.f171d;
        bVar2.f172e = bVar.f172e;
        bVar2.f173f = bVar.f173f;
        bVar2.f174x = bVar.f174x;
        bVar2.G = bVar.G;
        bVar2.F = bVar.F;
        bVar2.f175y = bVar.f175y;
        bVar2.f176z = bVar.f176z;
        bVar2.B = bVar.B;
        bVar2.C = bVar.C;
        bVar2.D = bVar.D;
        bVar2.H = bVar.H;
        bVar2.I = bVar.I;
        bVar2.J = bVar.J;
        bVar2.K = bVar.K;
        return bVar2;
    }

    public static int[] D0(a8.e eVar) {
        boolean z9;
        String str;
        if (eVar != null && (str = eVar.f184b) != null && str.startsWith("mb:")) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return null;
        }
        try {
            String[] split = eVar.f184b.split(":");
            if (split.length < 4) {
                return null;
            }
            return new int[]{Integer.parseInt(split[2]), Integer.parseInt(split[3])};
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object E(h7.p pVar, z6.e eVar) {
        t7.w wVar = new t7.w(eVar, eVar.getContext());
        Object j02 = com.bumptech.glide.c.j0(wVar, wVar, pVar);
        a7.a aVar = a7.a.f156a;
        return j02;
    }

    public static LinearLayout E0(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(context, 18)));
        return linearLayout;
    }

    public static final w6.c F(Throwable th) {
        u(th, "exception");
        return new w6.c(th);
    }

    public static LinearLayout.LayoutParams F0() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public static TextView G0(Context context, String str) {
        TextView l10 = w8.i.l(context, str.toUpperCase(), 12, w8.i.f11068h, 1);
        l10.setLetterSpacing(0.08f);
        return l10;
    }

    public static LinearLayout.LayoutParams H0(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(w8.i.e(context, 6), w8.i.e(context, 26), 0, w8.i.e(context, 10));
        return layoutParams;
    }

    public static void I(Object obj, ArrayList arrayList) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String optString = jSONObject.optString("url", "");
            if (!optString.isEmpty() && (optString.contains(".srt") || optString.contains(".vtt") || optString.contains(".txt"))) {
                arrayList.add(new String[]{optString, jSONObject.optString("lan", ""), jSONObject.optString("lanName", "")});
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    I(jSONObject.get(keys.next()), arrayList);
                } catch (Exception unused) {
                }
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    I(jSONArray.get(i10), arrayList);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static void I0(List list, q6.h hVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (hVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    public static void J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null && optJSONObject.has("subjectId") && optJSONObject.has("title")) {
                    arrayList3.add(optJSONObject);
                }
            }
            if (arrayList3.size() > arrayList.size()) {
                arrayList.clear();
                arrayList.addAll(arrayList3);
            }
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    J(jSONArray.get(i11), arrayList, arrayList2);
                } catch (Exception unused) {
                }
            }
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("subjectId") && jSONObject.has("title")) {
                arrayList2.add(jSONObject);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList4.add(keys.next());
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    J(jSONObject.get((String) it.next()), arrayList, arrayList2);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public static int J0(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static boolean K(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = g0.x0.f4272d;
            g0.x0 x0Var = (g0.x0) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (x0Var == null) {
                x0Var = new g0.x0();
                view.setTag(R.id.tag_unhandled_key_event_manager, x0Var);
            }
            WeakReference weakReference2 = x0Var.f4275c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                x0Var.f4275c = new WeakReference(keyEvent);
                if (x0Var.f4274b == null) {
                    x0Var.f4274b = new SparseArray();
                }
                SparseArray sparseArray = x0Var.f4274b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                } else {
                    weakReference = null;
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !g0.k0.b(view2)) {
                        return true;
                    }
                    g0.x0.b(view2);
                    return true;
                }
            }
        }
        return false;
    }

    public static int K0(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return J0(hashCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean L(g0.l r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = r6.h0.f9471c
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            r6.h0.f9472d = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            r6.h0.f9471c = r3
        L4c:
            java.lang.reflect.Method r1 = r6.h0.f9472d
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L61
            r4[r0] = r10     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = g0.y0.b(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = r6.h0.f9473e
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            r6.h0.f9474f = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            r6.h0.f9473e = r3
        L9a:
            java.lang.reflect.Field r7 = r6.h0.f9474f
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = g0.y0.b(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = g0.y0.b(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h0.L(g0.l, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static ArrayList L0(List list) {
        TreeSet treeSet = new TreeSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] D0 = D0((a8.e) it.next());
                if (D0 != null) {
                    treeSet.add(Integer.valueOf(D0[0]));
                }
            }
        }
        return new ArrayList(treeSet);
    }

    public static ArrayList M(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList();
            R(jSONObject, "dubs", arrayList2);
            HashSet hashSet = new HashSet();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                JSONArray jSONArray = (JSONArray) it.next();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String trim = optJSONObject.optString("subjectId", "").trim();
                        if (!trim.isEmpty() && hashSet.add(trim)) {
                            String trim2 = optJSONObject.optString("lanName", "").trim();
                            String trim3 = optJSONObject.optString("lanCode", "").trim();
                            boolean optBoolean = optJSONObject.optBoolean("original", false);
                            if (trim2.isEmpty()) {
                                if (optBoolean) {
                                    trim2 = "Original Audio";
                                } else {
                                    trim2 = trim3;
                                }
                            }
                            arrayList.add(new a8.d(trim, trim2, optBoolean));
                        }
                    }
                }
            }
        } catch (Exception e10) {
            Log.e("MovieBoxBridge", "dubsFromDetail", e10);
        }
        return arrayList;
    }

    public static final l7.d M0(l7.f fVar, int i10) {
        boolean z9;
        u(fVar, "<this>");
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Integer valueOf = Integer.valueOf(i10);
        u(valueOf, "step");
        if (z9) {
            if (fVar.f6884c <= 0) {
                i10 = -i10;
            }
            return new l7.d(fVar.f6882a, fVar.f6883b, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static String N(int i10, int i11, String str) {
        return "mb:" + str + ":" + i10 + ":" + i11;
    }

    public static String N0(a8.b bVar) {
        if (bVar == null) {
            return null;
        }
        String O0 = O0(bVar.D);
        if (O0 == null) {
            return O0(bVar.f169b);
        }
        return O0;
    }

    public static boolean O(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String O0(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.matches("\\d+")) {
            return trim;
        }
        if (!trim.startsWith("mb:")) {
            return null;
        }
        String[] split = trim.split(":");
        if (split.length < 2 || split[1].isEmpty()) {
            return null;
        }
        return split[1];
    }

    public static boolean P(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static a8.b P0(JSONObject jSONObject) {
        String str;
        String str2;
        String valueOf;
        a8.b bVar = new a8.b();
        String optString = jSONObject.optString("subjectId", jSONObject.optString(PiStreamDownloadService.EXTRA_ID, ""));
        bVar.D = i0(optString);
        bVar.f169b = i0(optString);
        bVar.f168a = jSONObject.optString("title", jSONObject.optString("name", "Untitled"));
        JSONObject optJSONObject = jSONObject.optJSONObject("cover");
        String str3 = null;
        if (optJSONObject != null) {
            bVar.f170c = optJSONObject.optString("url", optJSONObject.optString("thumbnail", null));
        }
        String str4 = bVar.f170c;
        if (str4 == null || str4.isEmpty()) {
            String[] strArr = {jSONObject.optString("poster", null), jSONObject.optString("img", null), jSONObject.optString("image", null), jSONObject.optString("pic", null)};
            int i10 = 0;
            while (true) {
                if (i10 < 4) {
                    str = strArr[i10];
                    if (str != null && !str.isEmpty()) {
                        break;
                    }
                    i10++;
                } else {
                    str = null;
                    break;
                }
            }
            bVar.f170c = str;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("image");
        if (optJSONObject2 != null) {
            bVar.A = optJSONObject2.optString("url", null);
        }
        int optInt = jSONObject.optInt("year", jSONObject.optInt("releaseYear", jSONObject.optInt("airYear", 0)));
        if (optInt <= 0) {
            String[] strArr2 = {jSONObject.optString("releaseDate", null), jSONObject.optString("airDate", null)};
            int i11 = 0;
            while (true) {
                if (i11 < 2) {
                    String str5 = strArr2[i11];
                    if (str5 != null && !str5.isEmpty()) {
                        str3 = str5;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            if (str3 != null && str3.length() >= 4) {
                try {
                    optInt = Integer.parseInt(str3.substring(0, 4));
                } catch (Exception unused) {
                }
            }
        }
        if (optInt <= 0) {
            str2 = "";
        } else {
            str2 = String.valueOf(optInt);
        }
        bVar.f176z = str2;
        double d10 = Double.NaN;
        double optDouble = jSONObject.optDouble("rating", Double.NaN);
        if (Double.isNaN(optDouble)) {
            optDouble = jSONObject.optDouble("score", Double.NaN);
        }
        if (Double.isNaN(optDouble)) {
            optDouble = jSONObject.optDouble("imdbRating", Double.NaN);
        }
        if (Double.isNaN(optDouble)) {
            String optString2 = jSONObject.optString("imdbRatingValue", "");
            if (optString2 != null) {
                try {
                    if (!optString2.trim().isEmpty()) {
                        optDouble = Double.parseDouble(optString2.trim());
                    }
                } catch (Exception unused2) {
                }
            }
            optDouble = Double.NaN;
        }
        if (Double.isNaN(optDouble)) {
            String optString3 = jSONObject.optString("imdbRate", "");
            if (optString3 != null) {
                try {
                    if (!optString3.trim().isEmpty()) {
                        d10 = Double.parseDouble(optString3.trim());
                    }
                } catch (Exception unused3) {
                }
            }
            optDouble = d10;
        }
        if (Double.isNaN(optDouble)) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(optDouble);
        }
        bVar.C = valueOf;
        bVar.f172e = jSONObject.optString("genre", "").replace((char) 65292, ',');
        bVar.f171d = jSONObject.optString("description", jSONObject.optString("desc", ""));
        bVar.f175y = "HD";
        bVar.B = "";
        bVar.f174x = "";
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x1 Q(Set set, h1.p pVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof x1) {
                x1 x1Var = (x1) sortedSet;
                q6.h hVar = x1Var.f9570b;
                hVar.getClass();
                return new y1((SortedSet) x1Var.f9569a, new q6.i(Arrays.asList(hVar, pVar)));
            }
            sortedSet.getClass();
            return new y1(sortedSet, pVar);
        }
        if (set instanceof x1) {
            x1 x1Var2 = (x1) set;
            q6.h hVar2 = x1Var2.f9570b;
            hVar2.getClass();
            return new x1((Set) x1Var2.f9569a, new q6.i(Arrays.asList(hVar2, pVar)));
        }
        set.getClass();
        return new x1(set, pVar);
    }

    public static ArrayList Q0(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        J(jSONObject, arrayList, arrayList2);
        if (arrayList.isEmpty()) {
            arrayList = arrayList2;
        }
        Log.d("MovieBox", "subjectsToItems: candidates=" + arrayList.size());
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                a8.b P0 = P0((JSONObject) it.next());
                String str = P0.D;
                if (str != null && !str.isEmpty() && hashSet.add(P0.D)) {
                    arrayList3.add(P0);
                }
            } catch (Exception e10) {
                Log.e("MovieBoxBridge", "subjectToItem", e10);
            }
        }
        return arrayList3;
    }

    public static void R(Object obj, String str, ArrayList arrayList) {
        try {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList2.add(keys.next());
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Object obj2 = jSONObject.get(str2);
                    if (str2.equals(str) && (obj2 instanceof JSONArray)) {
                        arrayList.add((JSONArray) obj2);
                    } else {
                        R(obj2, str, arrayList);
                    }
                }
                return;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    R(jSONArray.get(i10), str, arrayList);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static String R0(String str, String str2) {
        String str3 = "";
        if (str != null) {
            String lowerCase = str.trim().toLowerCase(Locale.US);
            if (lowerCase.length() > 3) {
                lowerCase = lowerCase.substring(0, 3);
            }
            if (lowerCase.equals("eng")) {
                str3 = "English";
            } else {
                if (!lowerCase.equals("ara")) {
                    if (!lowerCase.equals("fre") && !lowerCase.equals("fra")) {
                        if (!lowerCase.equals("spa")) {
                            if (!lowerCase.equals("ger") && !lowerCase.equals("deu")) {
                                if (!lowerCase.equals("hin")) {
                                    if (!lowerCase.equals("ben")) {
                                        if (!lowerCase.equals("ind")) {
                                            if (!lowerCase.equals("may") && !lowerCase.equals("msa")) {
                                                if (!lowerCase.equals("por")) {
                                                    if (!lowerCase.equals("rus")) {
                                                        if (!lowerCase.equals("tur") && !lowerCase.equals("ota")) {
                                                            if (!lowerCase.equals("tha")) {
                                                                if (!lowerCase.equals("vie")) {
                                                                    if (!lowerCase.equals("chi") && !lowerCase.equals("zho")) {
                                                                        if (!lowerCase.equals("jpn")) {
                                                                            if (!lowerCase.equals("kor")) {
                                                                                if (!lowerCase.equals("ita")) {
                                                                                    if (!lowerCase.equals("dut") && !lowerCase.equals("nld")) {
                                                                                        if (!lowerCase.equals("pol")) {
                                                                                            if (!lowerCase.equals("ukr")) {
                                                                                                if (!lowerCase.equals("per") && !lowerCase.equals("fas")) {
                                                                                                    if (!lowerCase.equals("urd")) {
                                                                                                        if (!lowerCase.equals("tam")) {
                                                                                                            if (!lowerCase.equals("tel")) {
                                                                                                                if (!lowerCase.equals("mal")) {
                                                                                                                    if (!lowerCase.equals("tgl") && !lowerCase.equals("fil")) {
                                                                                                                        if (!lowerCase.equals("vie")) {
                                                                                                                            if (!lowerCase.equals("tha")) {
                                                                                                                                if (lowerCase.equals("heb")) {
                                                                                                                                    str3 = "Hebrew";
                                                                                                                                } else if (!lowerCase.equals("gre") && !lowerCase.equals("ell")) {
                                                                                                                                    if (!lowerCase.equals("rum") && !lowerCase.equals("ron")) {
                                                                                                                                        if (lowerCase.equals("hun")) {
                                                                                                                                            str3 = "Hungarian";
                                                                                                                                        } else if (!lowerCase.equals("cze") && !lowerCase.equals("ces")) {
                                                                                                                                            if (lowerCase.equals("swe")) {
                                                                                                                                                str3 = "Swedish";
                                                                                                                                            } else if (lowerCase.equals("dan")) {
                                                                                                                                                str3 = "Danish";
                                                                                                                                            } else if (lowerCase.equals("fin")) {
                                                                                                                                                str3 = "Finnish";
                                                                                                                                            } else if (lowerCase.equals("nor")) {
                                                                                                                                                str3 = "Norwegian";
                                                                                                                                            } else if (!lowerCase.equals("pun") && !lowerCase.equals("pan")) {
                                                                                                                                                if (lowerCase.equals("guj")) {
                                                                                                                                                    str3 = "Gujarati";
                                                                                                                                                } else if (lowerCase.equals("mar")) {
                                                                                                                                                    str3 = "Marathi";
                                                                                                                                                } else if (lowerCase.equals("kan")) {
                                                                                                                                                    str3 = "Kannada";
                                                                                                                                                } else if (lowerCase.equals("ori")) {
                                                                                                                                                    str3 = "Odia";
                                                                                                                                                } else if (lowerCase.equals("sin")) {
                                                                                                                                                    str3 = "Sinhala";
                                                                                                                                                } else if (lowerCase.equals("nep")) {
                                                                                                                                                    str3 = "Nepali";
                                                                                                                                                } else if (!lowerCase.equals("mya") && !lowerCase.equals("bur")) {
                                                                                                                                                    if (lowerCase.equals("khm")) {
                                                                                                                                                        str3 = "Khmer";
                                                                                                                                                    } else if (lowerCase.equals("lao")) {
                                                                                                                                                        str3 = "Lao";
                                                                                                                                                    } else if (lowerCase.equals("amh")) {
                                                                                                                                                        str3 = "Amharic";
                                                                                                                                                    } else if (lowerCase.equals("swa")) {
                                                                                                                                                        str3 = "Swahili";
                                                                                                                                                    } else if (lowerCase.equals("yor")) {
                                                                                                                                                        str3 = "Yoruba";
                                                                                                                                                    } else if (lowerCase.equals("hau")) {
                                                                                                                                                        str3 = "Hausa";
                                                                                                                                                    } else if (lowerCase.equals("zul")) {
                                                                                                                                                        str3 = "Zulu";
                                                                                                                                                    } else if (lowerCase.equals("afr")) {
                                                                                                                                                        str3 = "Afrikaans";
                                                                                                                                                    } else if (lowerCase.equals("en")) {
                                                                                                                                                        str3 = "English";
                                                                                                                                                    } else if (!lowerCase.equals("ar")) {
                                                                                                                                                        if (!lowerCase.equals("fr")) {
                                                                                                                                                            if (!lowerCase.equals("es")) {
                                                                                                                                                                if (!lowerCase.equals("de")) {
                                                                                                                                                                    if (!lowerCase.equals("hi")) {
                                                                                                                                                                        if (!lowerCase.equals("bn")) {
                                                                                                                                                                            if (!lowerCase.equals(PiStreamDownloadService.EXTRA_ID)) {
                                                                                                                                                                                if (!lowerCase.equals("ms")) {
                                                                                                                                                                                    if (!lowerCase.equals("pt")) {
                                                                                                                                                                                        if (!lowerCase.equals("ru")) {
                                                                                                                                                                                            if (!lowerCase.equals("tr")) {
                                                                                                                                                                                                if (!lowerCase.equals("th")) {
                                                                                                                                                                                                    if (!lowerCase.equals("vi")) {
                                                                                                                                                                                                        if (!lowerCase.equals("zh")) {
                                                                                                                                                                                                            if (!lowerCase.equals("ja")) {
                                                                                                                                                                                                                if (!lowerCase.equals("ko")) {
                                                                                                                                                                                                                    if (!lowerCase.equals("it")) {
                                                                                                                                                                                                                        if (!lowerCase.equals("nl")) {
                                                                                                                                                                                                                            if (!lowerCase.equals("pl")) {
                                                                                                                                                                                                                                if (!lowerCase.equals("uk")) {
                                                                                                                                                                                                                                    if (!lowerCase.equals("fa")) {
                                                                                                                                                                                                                                        if (!lowerCase.equals("ur")) {
                                                                                                                                                                                                                                            if (!lowerCase.equals("ta")) {
                                                                                                                                                                                                                                                if (!lowerCase.equals("te")) {
                                                                                                                                                                                                                                                    if (!lowerCase.equals("ml")) {
                                                                                                                                                                                                                                                        if (!lowerCase.equals("tl")) {
                                                                                                                                                                                                                                                            str3 = "";
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    str3 = "Burmese";
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                str3 = "Punjabi";
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            str3 = "Czech";
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        str3 = "Romanian";
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    str3 = "Greek";
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    str3 = "Filipino";
                                                                                                                }
                                                                                                                str3 = "Malayalam";
                                                                                                            }
                                                                                                            str3 = "Telugu";
                                                                                                        }
                                                                                                        str3 = "Tamil";
                                                                                                    }
                                                                                                    str3 = "Urdu";
                                                                                                }
                                                                                                str3 = "Persian";
                                                                                            }
                                                                                            str3 = "Ukrainian";
                                                                                        }
                                                                                        str3 = "Polish";
                                                                                    }
                                                                                    str3 = "Dutch";
                                                                                }
                                                                                str3 = "Italian";
                                                                            }
                                                                            str3 = "Korean";
                                                                        }
                                                                        str3 = "Japanese";
                                                                    }
                                                                    str3 = "Chinese";
                                                                }
                                                                str3 = "Vietnamese";
                                                            }
                                                            str3 = "Thai";
                                                        }
                                                        str3 = "Turkish";
                                                    }
                                                    str3 = "Russian";
                                                }
                                                str3 = "Portuguese";
                                            }
                                            str3 = "Malay";
                                        }
                                        str3 = "Indonesian";
                                    }
                                    str3 = "Bengali";
                                }
                                str3 = "Hindi";
                            }
                            str3 = "German";
                        }
                        str3 = "Spanish";
                    }
                    str3 = "French";
                }
                str3 = "Arabic";
            }
        }
        if (!str3.isEmpty()) {
            return str3;
        }
        if (str2 != null && !str2.trim().isEmpty() && str2.indexOf(65533) < 0) {
            return str2.trim();
        }
        if (str != null && !str.trim().isEmpty()) {
            return str.trim().toUpperCase(Locale.US);
        }
        return "Subtitle";
    }

    public static final z6.i S(z6.i iVar, z6.i iVar2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        z6.c cVar = z6.c.f12072e;
        boolean booleanValue = ((Boolean) iVar.x(bool, cVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.x(bool, cVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.t(iVar2);
        }
        i7.k kVar = new i7.k();
        kVar.f5412a = iVar2;
        z6.j jVar = z6.j.f12080a;
        z6.i iVar3 = (z6.i) iVar.x(jVar, new o7.i(2, kVar, z9));
        if (booleanValue2) {
            kVar.f5412a = ((z6.i) kVar.f5412a).x(jVar, z6.c.f12071d);
        }
        return iVar3.t((z6.i) kVar.f5412a);
    }

    public static ArrayList S0(d8.b bVar, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (str2 != null) {
            try {
                if (!str2.isEmpty()) {
                    Iterator it = c0(bVar.q(str, str2)).iterator();
                    while (it.hasNext()) {
                        a8.g gVar = (a8.g) it.next();
                        if (hashSet.add(gVar.f195a)) {
                            arrayList.add(gVar);
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e("MovieBoxBridge", "subtitleOptions", e10);
            }
        }
        if (str3 == null || str3.isEmpty()) {
            str3 = str;
        }
        Iterator it2 = c0(bVar.h(str, str3)).iterator();
        while (it2.hasNext()) {
            a8.g gVar2 = (a8.g) it2.next();
            if (hashSet.add(gVar2.f195a)) {
                arrayList.add(gVar2);
            }
        }
        Collections.sort(arrayList, new u.f(8));
        return arrayList;
    }

    public static final String T(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - 500000000) / 1000000000) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - 500000) / 1000000) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - 500) / 1000) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + 500) / 1000) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + 500000) / 1000000) + " ms";
        } else {
            str = ((j4 + 500000000) / 1000000000) + " s ";
        }
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        s(format, "format(format, *args)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long T0(java.lang.String r21, long r22, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h0.T0(java.lang.String, long, long, long):long");
    }

    public static z6.g U(z6.g gVar, z6.h hVar) {
        u(hVar, "key");
        if (!g(gVar.getKey(), hVar)) {
            return null;
        }
        return gVar;
    }

    public static int U0(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return (int) T0(str, i10, i11, i12);
    }

    public static final void V0(Object obj) {
        if (!(obj instanceof w6.c)) {
        } else {
            throw ((w6.c) obj).f11014a;
        }
    }

    public static Object W(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static void W0() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static Object X(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static void X0(String str) {
        j1.k0 k0Var = new j1.k0(r.f.e("lateinit property ", str, " has not been initialized"));
        A0(h0.class.getName(), k0Var);
        throw k0Var;
    }

    public static Object Y(n1 n1Var) {
        m0 listIterator = n1Var.listIterator(0);
        Object next = listIterator.next();
        if (!listIterator.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(next);
        for (int i10 = 0; i10 < 4 && listIterator.hasNext(); i10++) {
            sb.append(", ");
            sb.append(listIterator.next());
        }
        if (listIterator.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final Map Y0(LinkedHashMap linkedHashMap) {
        u(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        s(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinearLayout Z0(Context context, int i10, String str, String str2, boolean z9, Consumer consumer, m8.d0 d0Var) {
        int parseColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setPadding(w8.i.e(context, 18), 0, w8.i.e(context, 16), 0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, w8.i.e(context, 74)));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(w8.i.j(w8.i.f11064d, w8.i.e(context, 20)));
        frameLayout.addView(d0Var.d(i10, 20, 20, -1), new FrameLayout.LayoutParams(w8.i.e(context, 20), w8.i.e(context, 20), 17));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 40)));
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i11 = 1;
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(w8.i.e(context, 16), 0, 0, 0);
        linearLayout.addView(linearLayout2, layoutParams);
        r.f.i(-2, -2, linearLayout2, w8.i.l(context, str, 15, -1, 1));
        TextView l10 = w8.i.l(context, str2, 12, w8.i.f11068h, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, w8.i.e(context, 3), 0, 0);
        linearLayout2.addView(l10, layoutParams2);
        Switch r9 = new Switch(context);
        r9.setChecked(z9);
        if (z9) {
            parseColor = w8.i.f11065e;
        } else {
            parseColor = Color.parseColor("#888888");
        }
        r9.setThumbTintList(ColorStateList.valueOf(parseColor));
        r9.setTrackTintList(ColorStateList.valueOf(Color.argb(80, 255, 255, 255)));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(w8.i.e(context, 12), 0, 0, 0);
        linearLayout.addView(r9, layoutParams3);
        r9.setOnCheckedChangeListener(new m8.d(i11, r9, consumer));
        return linearLayout;
    }

    public static int a(a8.h hVar) {
        try {
            return Integer.parseInt(hVar.f198a.replaceAll("[^0-9]", ""));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009e, code lost:
    
        if (r9 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a1(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            u(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = o7.j.s1(r0)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto Lcc
            java.lang.String r1 = "\r\n"
            java.lang.String r3 = "\n"
            java.lang.String r4 = "\r"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3, r4}
            r3 = 0
            o7.j.z1(r3)
            java.util.List r1 = x6.i.g1(r1)
            o7.c r4 = new o7.c
            o7.i r5 = new o7.i
            r5.<init>(r2, r1, r3)
            r4.<init>(r13, r3, r3, r5)
            x6.a r1 = new x6.a
            r5 = 2
            r1.<init>(r13, r5)
            n7.i r5 = new n7.i
            r5.<init>(r4, r1)
            java.util.List r1 = n7.e.k0(r5)
            int r13 = r13.length()
            int r4 = r1.size()
            int r4 = r4 * r3
            int r4 = r4 + r13
            int r13 = com.bumptech.glide.c.w(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
            r6 = r3
        L52:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Lb0
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto La8
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            if (r6 == 0) goto L67
            if (r6 != r13) goto L6f
        L67:
            boolean r6 = o7.j.s1(r7)
            if (r6 == 0) goto L6f
        L6d:
            r7 = r9
            goto La1
        L6f:
            int r6 = r7.length()
            r10 = r3
        L74:
            r11 = -1
            if (r10 >= r6) goto L86
            char r12 = r7.charAt(r10)
            boolean r12 = com.bumptech.glide.c.J(r12)
            r12 = r12 ^ r2
            if (r12 == 0) goto L83
            goto L87
        L83:
            int r10 = r10 + 1
            goto L74
        L86:
            r10 = r11
        L87:
            if (r10 != r11) goto L8a
            goto L9e
        L8a:
            boolean r6 = o7.j.B1(r7, r0, r10, r3)
            if (r6 == 0) goto L9e
            int r6 = r0.length()
            int r6 = r6 + r10
            java.lang.String r9 = r7.substring(r6)
            java.lang.String r6 = "substring(...)"
            s(r9, r6)
        L9e:
            if (r9 == 0) goto La1
            goto L6d
        La1:
            if (r7 == 0) goto La6
            r5.add(r7)
        La6:
            r6 = r8
            goto L52
        La8:
            java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r13.<init>(r0)
            throw r13
        Lb0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r4)
            java.lang.String r7 = "\n"
            java.lang.String r9 = ""
            r10 = -1
            java.lang.String r11 = "..."
            r12 = 0
            r6 = r13
            r8 = r9
            x6.m.q0(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "toString(...)"
            s(r13, r0)
            return r13
        Lcc:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h0.a1(java.lang.String):java.lang.String");
    }

    public static final void b(b9.a aVar, b9.c cVar, String str) {
        Logger m5 = b9.f.f1562h.m();
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.f1555b);
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        s(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.f1548a);
        m5.fine(sb.toString());
    }

    public static final void b0(z6.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = t7.g.f10059a.iterator();
        while (it.hasNext()) {
            try {
                ((q7.b) ((p7.x) it.next())).G(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.bumptech.glide.d.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            com.bumptech.glide.d.a(th, new t7.h(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static void c(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, boolean z9) {
        linearLayout.addView(linearLayout2);
        if (!z9) {
            View view = new View(context);
            view.setBackgroundColor(Color.argb(18, 255, 255, 255));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e(context, 1));
            layoutParams.setMargins(w8.i.e(context, 18), 0, w8.i.e(context, 18), 0);
            linearLayout.addView(view, layoutParams);
        }
    }

    public static ArrayList c0(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            I(jSONObject, arrayList2);
            HashSet hashSet = new HashSet();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String[] strArr = (String[]) it.next();
                if (hashSet.add(strArr[0])) {
                    String str = strArr[0];
                    String str2 = strArr[1];
                    arrayList.add(new a8.g(str, str2, R0(str2, strArr[2])));
                }
            }
        } catch (Exception e10) {
            Log.e("MovieBoxBridge", "harvestSubtitles", e10);
        }
        return arrayList;
    }

    public static final l7.f c1(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            l7.f fVar = l7.f.f6889d;
            return l7.f.f6889d;
        }
        return new l7.f(i10, i11 - 1);
    }

    public static ArrayList d(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(context.getApplicationContext().getSharedPreferences("pistream_continue_watching", 0).getString("items", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    a8.b bVar = new a8.b();
                    bVar.f168a = optJSONObject.optString("title", "");
                    bVar.f169b = optJSONObject.optString("url", "");
                    bVar.f170c = optJSONObject.optString("thumbnail", "");
                    bVar.A = optJSONObject.optString("banner", "");
                    bVar.f171d = optJSONObject.optString("description", "");
                    bVar.f172e = optJSONObject.optString("genres", "");
                    bVar.f173f = optJSONObject.optString("studio", "");
                    bVar.f174x = optJSONObject.optString("episode", "");
                    bVar.G = optJSONObject.optString("episodeName", "");
                    bVar.F = optJSONObject.optString("episodeUrl", "");
                    bVar.f175y = optJSONObject.optString("quality", "");
                    bVar.f176z = optJSONObject.optString("year", "");
                    bVar.B = optJSONObject.optString("status", "");
                    bVar.C = optJSONObject.optString("rating", "");
                    bVar.D = optJSONObject.optString("playbackId", "");
                    bVar.H = optJSONObject.optLong("positionMs", 0L);
                    bVar.I = optJSONObject.optLong("durationMs", 0L);
                    bVar.J = optJSONObject.optInt("percent", 0);
                    bVar.K = optJSONObject.optLong("updatedAt", 0L);
                    arrayList.add(bVar);
                }
            }
        } catch (Exception e10) {
            Log.e("ContinueWatchingStore", "exception", e10);
        }
        return arrayList;
    }

    public static int d0(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = ~(~(i11 + i10));
        }
        return i11;
    }

    public static final p7.z1 d1(z6.e eVar, z6.i iVar, Object obj) {
        boolean z9;
        p7.z1 z1Var = null;
        if (!(eVar instanceof b7.d)) {
            return null;
        }
        if (iVar.r(p7.a2.f8661a) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return null;
        }
        b7.d dVar = (b7.d) eVar;
        while (true) {
            if ((dVar instanceof p7.g0) || (dVar = dVar.getCallerFrame()) == null) {
                break;
            }
            if (dVar instanceof p7.z1) {
                z1Var = (p7.z1) dVar;
                break;
            }
        }
        if (z1Var != null) {
            z1Var.V(iVar, obj);
        }
        return z1Var;
    }

    public static ArrayList e(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(context.getApplicationContext().getSharedPreferences("pistream_search_history", 0).getString("entries", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    w7.d dVar = new w7.d();
                    dVar.f11043a = optJSONObject.optString("query", "");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("item");
                    a8.b bVar = new a8.b();
                    if (optJSONObject2 != null) {
                        bVar.f168a = optJSONObject2.optString("title", "");
                        bVar.f169b = optJSONObject2.optString("url", "");
                        bVar.f170c = optJSONObject2.optString("thumbnail", "");
                        bVar.f171d = optJSONObject2.optString("description", "");
                        bVar.f172e = optJSONObject2.optString("genres", "");
                        bVar.f173f = optJSONObject2.optString("studio", "");
                        bVar.f174x = optJSONObject2.optString("episode", "");
                        bVar.f175y = optJSONObject2.optString("quality", "");
                        bVar.f176z = optJSONObject2.optString("year", "");
                        bVar.A = optJSONObject2.optString("banner", "");
                        bVar.B = optJSONObject2.optString("status", "");
                        bVar.C = optJSONObject2.optString("rating", "");
                        bVar.D = optJSONObject2.optString("playbackId", "");
                    }
                    dVar.f11044b = bVar;
                    if (!dVar.f11043a.isEmpty()) {
                        arrayList.add(dVar);
                    }
                }
            }
        } catch (Exception e10) {
            Log.e("SearchHistoryStore", "exception", e10);
        }
        return arrayList;
    }

    public static LinearLayout e0(MainActivity mainActivity, int i10, String str, Runnable runnable, m8.d0 d0Var) {
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setGravity(16);
        linearLayout.setPadding(w8.i.e(mainActivity, 18), 0, w8.i.e(mainActivity, 16), 0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, w8.i.e(mainActivity, 66)));
        FrameLayout frameLayout = new FrameLayout(mainActivity);
        frameLayout.setBackground(w8.i.j(w8.i.f11064d, w8.i.e(mainActivity, 20)));
        frameLayout.addView(d0Var.d(i10, 20, 20, -1), new FrameLayout.LayoutParams(w8.i.e(mainActivity, 20), w8.i.e(mainActivity, 20), 17));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(w8.i.e(mainActivity, 40), w8.i.e(mainActivity, 40)));
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(w8.i.e(mainActivity, 16), 0, 0, 0);
        linearLayout.addView(linearLayout2, layoutParams);
        r.f.i(-2, -2, linearLayout2, w8.i.l(mainActivity, str, 15, -1, 1));
        linearLayout.addView(d0Var.d(R.drawable.ic_arrow_right, 16, 16, w8.i.f11068h), new LinearLayout.LayoutParams(w8.i.e(mainActivity, 16), w8.i.e(mainActivity, 16)));
        linearLayout.setOnClickListener(new j8.c(runnable, 3));
        w8.i.d(linearLayout);
        return linearLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0212 A[LOOP:3: B:118:0x020c->B:120:0x0212, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140 A[Catch: Exception -> 0x0187, TryCatch #5 {Exception -> 0x0187, blocks: (B:72:0x0131, B:56:0x0140, B:61:0x015e), top: B:71:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e1(d8.b r22, java.lang.String r23, org.json.JSONObject r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h0.e1(d8.b, java.lang.String, org.json.JSONObject, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static final void f(StringBuilder sb, Object obj, h7.l lVar) {
        boolean z9;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z9 = true;
        } else {
            z9 = obj instanceof CharSequence;
        }
        if (z9) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int f0(String str) {
        if (str == null) {
            return 0;
        }
        int[] iArr = {2160, 1440, 1080, 720, 480, 360, 240};
        for (int i10 = 0; i10 < 7; i10++) {
            int i11 = iArr[i10];
            if (str.contains(String.valueOf(i11))) {
                return i11;
            }
        }
        return 0;
    }

    public static final Object f1(z6.i iVar, h7.p pVar, z6.e eVar) {
        z6.i S;
        Object a10;
        z6.i context = eVar.getContext();
        boolean z9 = false;
        if (!((Boolean) iVar.x(Boolean.FALSE, z6.c.f12072e)).booleanValue()) {
            S = context.t(iVar);
        } else {
            S = S(context, iVar, false);
        }
        p7.a1 a1Var = (p7.a1) S.r(androidx.lifecycle.q0.f1134x);
        if (a1Var != null && !a1Var.a()) {
            throw ((p7.k1) a1Var).s();
        }
        if (S == context) {
            t7.w wVar = new t7.w(eVar, S);
            a10 = com.bumptech.glide.c.j0(wVar, wVar, pVar);
        } else {
            androidx.lifecycle.q0 q0Var = androidx.lifecycle.q0.A;
            if (g(S.r(q0Var), context.r(q0Var))) {
                p7.z1 z1Var = new p7.z1(eVar, S);
                z6.i iVar2 = z1Var.f8635c;
                Object b10 = t7.z.b(iVar2, null);
                try {
                    Object j02 = com.bumptech.glide.c.j0(z1Var, z1Var, pVar);
                    t7.z.a(iVar2, b10);
                    a10 = j02;
                } catch (Throwable th) {
                    t7.z.a(iVar2, b10);
                    throw th;
                }
            } else {
                p7.g0 g0Var = new p7.g0(eVar, S);
                try {
                    t7.j.a(com.bumptech.glide.d.F(com.bumptech.glide.d.o(g0Var, g0Var, pVar)), w6.f.f11019a, null);
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p7.g0.f8681e;
                        int i10 = atomicIntegerFieldUpdater.get(g0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended".toString());
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(g0Var, 0, 1)) {
                            z9 = true;
                            break;
                        }
                    }
                    if (z9) {
                        a10 = a7.a.f156a;
                    } else {
                        a10 = p7.l1.a(g0Var.B());
                        if (a10 instanceof p7.t) {
                            throw ((p7.t) a10).f8743a;
                        }
                    }
                } catch (Throwable th2) {
                    g0Var.resumeWith(F(th2));
                    throw th2;
                }
            }
        }
        a7.a aVar = a7.a.f156a;
        return a10;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static w1 g0(t0 t0Var, t0 t0Var2) {
        if (t0Var != null) {
            if (t0Var2 != null) {
                return new w1(t0Var, t0Var2);
            }
            throw new NullPointerException("set2");
        }
        throw new NullPointerException("set1");
    }

    public static p7.e0 h(p7.y yVar, h7.p pVar) {
        z6.i S = S(yVar.b(), z6.j.f12080a, true);
        u7.d dVar = p7.i0.f8691a;
        if (S != dVar && S.r(androidx.lifecycle.q0.A) == null) {
            S = S.t(dVar);
        }
        p7.e0 e0Var = new p7.e0(S, true);
        e0Var.T(1, e0Var, pVar);
        return e0Var;
    }

    public static boolean h0(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public static String i(int i10, int i11, String str) {
        if (i10 < 0) {
            return p7.a0.M("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return p7.a0.M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a3.g.n("negative size: ", i11));
    }

    public static String i0(String str) {
        return r.f.d("mb:", str);
    }

    public static View j(Context context, int i10, int i11, int i12) {
        View view = new View(context);
        view.setBackground(w8.i.j(w8.i.f11064d, i12));
        view.setLayoutParams(new ViewGroup.LayoutParams(i10, i11));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.35f, 0.85f);
        ofFloat.setDuration(900L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new w8.e(view, 0));
        view.addOnAttachStateChangeListener(new w8.f(ofFloat, 0));
        if (view.isAttachedToWindow()) {
            ofFloat.start();
        }
        return view;
    }

    public static String j0(a8.b bVar) {
        if (bVar == null) {
            return "";
        }
        String o02 = o0(bVar.f169b);
        if (!o02.isEmpty() && o02.matches("\\d+")) {
            return o02;
        }
        String o03 = o0(bVar.D);
        if (!o03.isEmpty() && o03.matches("\\d+")) {
            return o03;
        }
        String[] strArr = {bVar.f169b, bVar.D, bVar.f168a};
        for (int i10 = 0; i10 < 3; i10++) {
            String str = strArr[i10];
            if (!h0(str)) {
                return str.trim();
            }
        }
        return "";
    }

    public static int k(int i10) {
        if (i10 < 3) {
            p(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(i10 / 0.75d);
        }
        return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static void k0(p7.y yVar, h7.p pVar) {
        z6.i S = S(yVar.b(), z6.j.f12080a, true);
        u7.d dVar = p7.i0.f8691a;
        if (S != dVar && S.r(androidx.lifecycle.q0.A) == null) {
            S = S.t(dVar);
        }
        p7.a r1Var = new p7.r1(S, true);
        r1Var.T(1, r1Var, pVar);
    }

    public static void l(boolean z9, String str, long j4) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(p7.a0.M(str, Long.valueOf(j4)));
        }
    }

    public static LinearLayout l0(Context context, int i10, int i11, int i12) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        for (int i13 = 0; i13 < i10; i13++) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(w8.i.e(context, 16), 0, w8.i.e(context, 14), 0);
            linearLayout2.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(context, 10)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i11);
            layoutParams.bottomMargin = i12;
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.addView(j(context, w8.i.e(context, 56), w8.i.e(context, 18), w8.i.e(context, 4)), new LinearLayout.LayoutParams(w8.i.e(context, 56), w8.i.e(context, 18)));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(w8.i.e(context, 56), w8.i.e(context, 72));
            layoutParams2.leftMargin = w8.i.e(context, 26);
            linearLayout2.addView(j(context, w8.i.e(context, 56), w8.i.e(context, 72), w8.i.e(context, 6)), layoutParams2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams3.leftMargin = w8.i.e(context, 16);
            linearLayout2.addView(linearLayout3, layoutParams3);
            linearLayout3.addView(j(context, w8.i.e(context, 160), w8.i.e(context, 12), w8.i.e(context, 4)), new LinearLayout.LayoutParams(w8.i.e(context, 160), w8.i.e(context, 12)));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(w8.i.e(context, 100), w8.i.e(context, 10));
            layoutParams4.topMargin = w8.i.e(context, 10);
            linearLayout3.addView(j(context, w8.i.e(context, 100), w8.i.e(context, 10), w8.i.e(context, 4)), layoutParams4);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    public static void m(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static final int m0(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public static void n(int i10, int i11) {
        String M;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                M = p7.a0.M("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(a3.g.n("negative size: ", i11));
            }
        } else {
            M = p7.a0.M("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(M);
    }

    public static z6.i n0(z6.g gVar, z6.h hVar) {
        u(hVar, "key");
        if (g(gVar.getKey(), hVar)) {
            return z6.j.f12080a;
        }
        return gVar;
    }

    public static void o(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(a3.g.n("at index ", i11));
            }
        }
    }

    public static String o0(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.startsWith("mb:")) {
            String substring = trim.substring(3);
            if (substring.indexOf(58) < 0) {
                return substring;
            }
        }
        return trim;
    }

    public static void p(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void q(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        A0(h0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void r(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        A0(h0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void s(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        A0(h0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void t(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241 A[LOOP:3: B:110:0x023b->B:112:0x0241, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b A[Catch: Exception -> 0x01c2, TryCatch #7 {Exception -> 0x01c2, blocks: (B:71:0x0112, B:73:0x0118, B:74:0x011f, B:75:0x0123, B:77:0x0129, B:80:0x014c, B:124:0x00fb, B:126:0x0107, B:128:0x010e, B:62:0x017b, B:65:0x019a), top: B:70:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList t0(d8.b r21, java.lang.String r22, org.json.JSONObject r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.h0.t0(d8.b, java.lang.String, org.json.JSONObject, java.lang.String):java.util.ArrayList");
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = h0.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            A0(h0.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static FrameLayout u0(Context context, int i10, int i11) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i10, i11));
        frameLayout.setBackground(w8.i.j(w8.i.f11063c, w8.i.e(context, 6)));
        frameLayout.setClipToOutline(true);
        frameLayout.addView(j(context, -1, i11, 0), new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(w8.i.e(context, 12), 0, w8.i.e(context, 12), w8.i.e(context, 14));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.gradient_bottom);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, w8.i.e(context, 96), 80));
        View j4 = j(context, w8.i.e(context, 32), w8.i.e(context, 22), w8.i.e(context, 4));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(w8.i.e(context, 32), w8.i.e(context, 22), 51);
        layoutParams2.setMargins(w8.i.e(context, 12), w8.i.e(context, 12), 0, 0);
        frameLayout.addView(j4, layoutParams2);
        View j10 = j(context, w8.i.e(context, 48), w8.i.e(context, 22), w8.i.e(context, 4));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(w8.i.e(context, 48), w8.i.e(context, 22), 53);
        layoutParams3.setMargins(0, w8.i.e(context, 12), w8.i.e(context, 12), 0);
        frameLayout.addView(j10, layoutParams3);
        frameLayout.addView(linearLayout, layoutParams);
        linearLayout.addView(j(context, w8.i.e(context, 96), w8.i.e(context, 10), w8.i.e(context, 4)), new LinearLayout.LayoutParams(w8.i.e(context, 96), w8.i.e(context, 10)));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(w8.i.e(context, 64), w8.i.e(context, 10));
        layoutParams4.topMargin = w8.i.e(context, 8);
        linearLayout.addView(j(context, w8.i.e(context, 64), w8.i.e(context, 10), w8.i.e(context, 4)), layoutParams4);
        return frameLayout;
    }

    public static void v(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(i(i10, i11, "index"));
        }
    }

    public static LinearLayout v0(Context context, int i10, String str, String str2, m8.d0 d0Var) {
        int i11;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setPadding(w8.i.e(context, 18), 0, w8.i.e(context, 16), 0);
        if (str2 == null) {
            i11 = 66;
        } else {
            i11 = 74;
        }
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, w8.i.e(context, i11)));
        int i12 = w8.i.f11064d;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(w8.i.j(i12, w8.i.e(context, 20)));
        frameLayout.addView(d0Var.d(i10, 20, 20, -1), new FrameLayout.LayoutParams(w8.i.e(context, 20), w8.i.e(context, 20), 17));
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 40)));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(w8.i.e(context, 16), 0, 0, 0);
        linearLayout.addView(linearLayout2, layoutParams);
        TextView l10 = w8.i.l(context, str, 15, -1, 1);
        l10.setIncludeFontPadding(false);
        linearLayout2.addView(l10, new LinearLayout.LayoutParams(-2, -2));
        if (str2 != null) {
            TextView l11 = w8.i.l(context, str2, 12, w8.i.f11068h, 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, w8.i.e(context, 3), 0, 0);
            linearLayout2.addView(l11, layoutParams2);
        }
        linearLayout.addView(d0Var.d(R.drawable.ic_arrow_right, 16, 16, w8.i.f11068h), new LinearLayout.LayoutParams(w8.i.e(context, 16), w8.i.e(context, 16)));
        w8.i.d(linearLayout);
        return linearLayout;
    }

    public static void w(int i10, int i11, int i12) {
        String i13;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                i13 = p7.a0.M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                i13 = i(i11, i12, "end index");
            }
        } else {
            i13 = i(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(i13);
    }

    public static LinearLayout w0(LinearLayout linearLayout, Context context) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(w8.i.e(context, 24), w8.i.e(context, 24), w8.i.e(context, 24), w8.i.e(context, 40));
        a3.g.w(-1, -2, linearLayout, linearLayout2);
        return linearLayout2;
    }

    public static void x(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void x0(Context context, a8.b bVar) {
        String j02 = j0(bVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = d(context).iterator();
        while (it.hasNext()) {
            a8.b bVar2 = (a8.b) it.next();
            if (!j02.equals(j0(bVar2))) {
                arrayList.add(bVar2);
            }
        }
        B0(context, arrayList);
    }

    public static final void y0(p7.h0 h0Var, z6.e eVar, boolean z9) {
        Object i10;
        p7.z1 z1Var;
        boolean U;
        Object k10 = h0Var.k();
        Throwable h10 = h0Var.h(k10);
        if (h10 != null) {
            i10 = F(h10);
        } else {
            i10 = h0Var.i(k10);
        }
        if (z9) {
            r(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            t7.i iVar = (t7.i) eVar;
            z6.e eVar2 = iVar.f10063e;
            z6.i context = eVar2.getContext();
            Object b10 = t7.z.b(context, iVar.f10065x);
            if (b10 != t7.z.f10093a) {
                z1Var = d1(eVar2, context, b10);
            } else {
                z1Var = null;
            }
            try {
                iVar.f10063e.resumeWith(i10);
                if (z1Var != null) {
                    if (!U) {
                        return;
                    }
                }
                return;
            } finally {
                if (z1Var == null || z1Var.U()) {
                    t7.z.a(context, b10);
                }
            }
        }
        eVar.resumeWith(i10);
    }

    public static LinearLayout z0(Context context, int i10, int i11, int i12) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(i10, i11, i12, 0);
        int e10 = w8.i.e(context, 168);
        int e11 = w8.i.e(context, 230);
        for (int i13 = 0; i13 < 4; i13++) {
            FrameLayout u02 = u0(context, e10, e11);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e10, e11);
            layoutParams.rightMargin = w8.i.e(context, 12);
            linearLayout.addView(u02, layoutParams);
        }
        return linearLayout;
    }

    public c1.p0 G(l2.a aVar) {
        boolean z9;
        ByteBuffer byteBuffer = aVar.f5262e;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        return H(aVar, byteBuffer);
    }

    public abstract c1.p0 H(l2.a aVar, ByteBuffer byteBuffer);

    public abstract void V(float f10, float f11, j6.u uVar);

    public int Z(View view) {
        return 0;
    }

    public int a0() {
        return 0;
    }

    public abstract boolean b1(View view, int i10);

    public void p0(View view, int i10) {
    }

    public abstract void q0(int i10);

    public abstract void r0(View view, int i10, int i11);

    public abstract void s0(View view, float f10, float f11);

    public abstract int y(View view, int i10);

    public abstract int z(View view, int i10);

    public /* synthetic */ h0(int i10) {
    }
}
