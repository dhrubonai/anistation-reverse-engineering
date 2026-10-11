package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class f0 extends d implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final b0.a f5505c;

    public f0(Context context, b0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f5505c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(((o) this.f5505c).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((o) this.f5505c).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f5505c).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        n.k kVar = this.f5500b;
        if (kVar != null) {
            kVar.clear();
        }
        ((o) this.f5505c).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f5505c).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return c(((o) this.f5505c).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return c(((o) this.f5505c).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f5505c).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f5505c).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f5505c).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f5505c).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (this.f5500b != null) {
            int i11 = 0;
            while (true) {
                n.k kVar = this.f5500b;
                if (i11 >= kVar.f7891c) {
                    break;
                }
                if (((b0.b) kVar.h(i11)).getGroupId() == i10) {
                    this.f5500b.j(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f5505c).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (this.f5500b != null) {
            int i11 = 0;
            while (true) {
                n.k kVar = this.f5500b;
                if (i11 >= kVar.f7891c) {
                    break;
                }
                if (((b0.b) kVar.h(i11)).getItemId() == i10) {
                    this.f5500b.j(i11);
                    break;
                }
                i11++;
            }
        }
        ((o) this.f5505c).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z9, boolean z10) {
        ((o) this.f5505c).setGroupCheckable(i10, z9, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z9) {
        ((o) this.f5505c).setGroupEnabled(i10, z9);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z9) {
        ((o) this.f5505c).setGroupVisible(i10, z9);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f5505c.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f5505c).size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f5505c).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return c(((o) this.f5505c).add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return ((o) this.f5505c).addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return c(((o) this.f5505c).a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f5505c).addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return c(((o) this.f5505c).add(i10, i11, i12, i13));
    }
}
