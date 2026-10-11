package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import defpackage.kl0;
import defpackage.nt1;
import defpackage.q71;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.ub2;
import defpackage.x44;
import defpackage.yo0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final x44 onStorageEventCallbacks = tx5.a(nt1.x);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    public Storage(String str, StorageManager.StorageType storageType) {
        str.getClass();
        storageType.getClass();
        this._targetFileName = str;
        this.type = storageType;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z = false;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e);
            }
        } catch (Exception e2) {
            DeviceLog.debug("Failed to read storage JSON file:", e2);
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, kl0.a)));
        z = true;
        return z;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List list = (List) ((sx5) onStorageEventCallbacks).getValue();
        if (!list.isEmpty()) {
            storageEvent.getClass();
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ub2) it.next()).invoke(storageEventInfo);
            }
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() != null) {
            return Utilities.writeFile(file, getData().toString());
        }
        return false;
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        public final void addStorageEventCallback(ub2 ub2Var) {
            sx5 sx5Var;
            Object value;
            ub2Var.getClass();
            x44 x44Var = Storage.onStorageEventCallbacks;
            do {
                sx5Var = (sx5) x44Var;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, yo0.v0((List) value, ub2Var)));
        }

        public final void removeStorageEventCallback(ub2 ub2Var) {
            sx5 sx5Var;
            Object value;
            ub2Var.getClass();
            x44 x44Var = Storage.onStorageEventCallbacks;
            do {
                sx5Var = (sx5) x44Var;
                value = sx5Var.getValue();
            } while (!sx5Var.j(value, yo0.t0(ub2Var, (List) value)));
        }

        private Companion() {
        }
    }
}
