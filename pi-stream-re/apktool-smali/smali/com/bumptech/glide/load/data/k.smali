.class public final Lcom/bumptech/glide/load/data/k;
.super Lcom/bumptech/glide/load/data/b;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/bumptech/glide/load/data/k;->e:I

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/data/b;-><init>(Ljava/lang/Object;Ljava/lang/Comparable;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/data/k;->e:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljava/io/InputStream;

    return-object v0

    :pswitch_0
    const-class v0, Landroid/content/res/AssetFileDescriptor;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/data/k;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    check-cast p1, Landroid/content/res/AssetFileDescriptor;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :goto_0
    check-cast p1, Ljava/io/InputStream;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/Closeable;
    .locals 1

    .line 1
    iget v0, p0, Lcom/bumptech/glide/load/data/k;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
