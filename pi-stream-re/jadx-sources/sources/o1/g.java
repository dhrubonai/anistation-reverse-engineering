package o1;

import java.util.UUID;

/* loaded from: classes.dex */
public final class g extends Exception {
    public g(UUID uuid) {
        super("Media does not support uuid: " + uuid);
    }
}
