package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import g0.a1;
import g0.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class o implements b0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f5545y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f5546a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f5547b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5548c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5549d;

    /* renamed from: e, reason: collision with root package name */
    public m f5550e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5551f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5552g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5553h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5554i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5555j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5556k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f5558m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f5559n;
    public View o;

    /* renamed from: v, reason: collision with root package name */
    public q f5566v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5568x;

    /* renamed from: l, reason: collision with root package name */
    public int f5557l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5560p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5561q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5562r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5563s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f5564t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f5565u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f5567w = false;

    public o(Context context) {
        boolean z9;
        boolean z10 = false;
        this.f5546a = context;
        Resources resources = context.getResources();
        this.f5547b = resources;
        this.f5551f = new ArrayList();
        this.f5552g = new ArrayList();
        this.f5553h = true;
        this.f5554i = new ArrayList();
        this.f5555j = new ArrayList();
        this.f5556k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = b1.f4169a;
            if (Build.VERSION.SDK_INT >= 28) {
                z9 = a1.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                z10 = true;
            }
        }
        this.f5549d = z10;
    }

    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f5545y[i14] << 16) | (65535 & i12);
            q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f5557l);
            ArrayList arrayList = this.f5551f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((q) arrayList.get(size)).f5575d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, qVar);
            p(true);
            return qVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f5546a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f5578g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a10;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(c0 c0Var, Context context) {
        this.f5565u.add(new WeakReference(c0Var));
        c0Var.g(context, this);
        this.f5556k = true;
    }

    public final void c(boolean z9) {
        if (this.f5563s) {
            return;
        }
        this.f5563s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c0Var.a(this, z9);
            }
        }
        this.f5563s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f5566v;
        if (qVar != null) {
            d(qVar);
        }
        this.f5551f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f5559n = null;
        this.f5558m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
        boolean z9 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f5566v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z9 = c0Var.i(qVar);
                    if (z9) {
                        break;
                    }
                }
            }
            v();
            if (z9) {
                this.f5566v = null;
            }
        }
        return z9;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f5550e;
        if (mVar != null && mVar.q(oVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
        boolean z9 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 = c0Var.c(qVar);
                if (z9) {
                    break;
                }
            }
        }
        v();
        if (z9) {
            this.f5566v = qVar;
        }
        return z9;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) this.f5551f.get(i11);
            if (qVar.f5572a == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i10, KeyEvent keyEvent) {
        char c6;
        ArrayList arrayList = this.f5564t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n9 = n();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (n9) {
                c6 = qVar.f5581j;
            } else {
                c6 = qVar.f5579h;
            }
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (n9 && c6 == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f5551f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c6;
        int i11;
        boolean z9;
        boolean n9 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f5551f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList2.get(i12);
            if (qVar.hasSubMenu()) {
                qVar.o.h(arrayList, i10, keyEvent);
            }
            if (n9) {
                c6 = qVar.f5581j;
            } else {
                c6 = qVar.f5579h;
            }
            if (n9) {
                i11 = qVar.f5582k;
            } else {
                i11 = qVar.f5580i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && c6 != 0) {
                char[] cArr = keyData.meta;
                if (c6 != cArr[0] && c6 != cArr[2]) {
                    if (n9 && c6 == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (qVar.isEnabled()) {
                    arrayList.add(qVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f5568x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) this.f5551f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f5556k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z9 |= c0Var.h();
            }
        }
        ArrayList arrayList = this.f5554i;
        ArrayList arrayList2 = this.f5555j;
        if (z9) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) l10.get(i10);
                if (qVar.f()) {
                    arrayList.add(qVar);
                } else {
                    arrayList2.add(qVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f5556k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z9 = this.f5553h;
        ArrayList arrayList = this.f5552g;
        if (!z9) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f5551f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f5553h = false;
        this.f5556k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f5567w;
    }

    public boolean n() {
        return this.f5548c;
    }

    public boolean o() {
        return this.f5549d;
    }

    public final void p(boolean z9) {
        if (!this.f5560p) {
            if (z9) {
                this.f5553h = true;
                this.f5556k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c0 c0Var = (c0) weakReference.get();
                    if (c0Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        c0Var.e();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f5561q = true;
        if (z9) {
            this.f5562r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z9;
        q g10 = g(i10, keyEvent);
        if (g10 != null) {
            z9 = q(g10, null, i11);
        } else {
            z9 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, j.c0 r8, int r9) {
        /*
            r6 = this;
            j.q r7 = (j.q) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f5586p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            j.o r1 = r7.f5585n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r3 = r7.f5578g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f5546a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L40
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            j.r r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f5597a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            j.r r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f5597a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            j.i0 r9 = new j.i0
            android.content.Context r5 = r6.f5546a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.f5576e
            r9.setHeaderTitle(r5)
        L90:
            j.i0 r7 = r7.o
            if (r4 == 0) goto L9e
            j.w r9 = r3.f5598b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f5597a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f5565u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.k(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            j.c0 r4 = (j.c0) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.k(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.o.q(android.view.MenuItem, j.c0, int):boolean");
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5565u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var2 = (c0) weakReference.get();
            if (c0Var2 == null || c0Var2 == c0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f5551f;
            if (i12 < size) {
                if (((q) arrayList.get(i12)).f5573b == i10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((q) arrayList.get(i12)).f5573b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f5551f;
            if (i11 < size) {
                if (((q) arrayList.get(i11)).f5572a == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        int i11;
        ArrayList arrayList = this.f5551f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f5573b == i10) {
                int i13 = qVar.f5594x & (-5);
                if (z10) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                qVar.f5594x = i13 | i11;
                qVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f5567w = z9;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z9) {
        ArrayList arrayList = this.f5551f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f5573b == i10) {
                qVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z9) {
        int i11;
        boolean z10;
        ArrayList arrayList = this.f5551f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f5573b == i10) {
                int i13 = qVar.f5594x;
                int i14 = i13 & (-9);
                if (z9) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                qVar.f5594x = i15;
                if (i13 != i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f5548c = z9;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f5551f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.f5558m = null;
            this.f5559n = null;
        } else {
            if (i10 > 0) {
                this.f5558m = this.f5547b.getText(i10);
            } else if (charSequence != null) {
                this.f5558m = charSequence;
            }
            if (i11 > 0) {
                this.f5559n = x.j.getDrawable(this.f5546a, i11);
            } else if (drawable != null) {
                this.f5559n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.f5560p = false;
        if (this.f5561q) {
            this.f5561q = false;
            p(this.f5562r);
        }
    }

    public final void w() {
        if (!this.f5560p) {
            this.f5560p = true;
            this.f5561q = false;
            this.f5562r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f5547b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f5547b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q a10 = a(i10, i11, i12, charSequence);
        i0 i0Var = new i0(this.f5546a, this, a10);
        a10.o = i0Var;
        i0Var.setHeaderTitle(a10.f5576e);
        return i0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f5547b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f5547b.getString(i13));
    }
}
