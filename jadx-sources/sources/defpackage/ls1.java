package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ls1 implements m91 {
    public final /* synthetic */ fg3 x;

    public ls1(EmojiCompatInitializer emojiCompatInitializer, fg3 fg3Var) {
        this.x = fg3Var;
    }

    @Override // defpackage.m91
    public final void onResume(og3 og3Var) {
        gv0.a(Looper.getMainLooper()).postDelayed(new ns1((byte) 0), 500L);
        this.x.b(this);
    }
}
