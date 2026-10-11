.class public final Landroidx/appcompat/widget/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/c0;
.implements Lo1/o;
.implements Lq1/p;
.implements Lz1/q;
.implements Ly2/l;
.implements Ld2/h;
.implements Lh3/c0;
.implements Lc0/c;
.implements Lv3/h;
.implements Lcom/bumptech/glide/load/data/d;
.implements Ly3/j;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Landroidx/appcompat/widget/a0;->a:I

    const/16 v0, 0x11

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x200

    invoke-direct {p1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/io/DataOutputStream;

    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 9
    new-instance p1, Lz3/c;

    invoke-direct {p1, v0}, Lz3/c;-><init>(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ly3/f;

    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0}, Ly3/f;-><init>(Ljava/lang/Object;)V

    .line 13
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Ly3/c;

    invoke-direct {p1, v0}, Ly3/c;-><init>(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 17
    new-instance p1, Landroidx/appcompat/widget/a0;

    const/16 v0, 0x1c

    invoke-direct {p1, v0}, Landroidx/appcompat/widget/a0;-><init>(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    .line 18
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, Lf1/t;

    invoke-direct {p1}, Lf1/t;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 20
    new-instance p1, Lg3/a;

    invoke-direct {p1}, Lg3/a;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    new-array p1, p1, [F

    .line 46
    fill-array-data p1, :array_0

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    new-array p1, v0, [F

    .line 49
    fill-array-data p1, :array_0

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/a0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Landroidx/appcompat/widget/a0;->a:I

    iput-object p2, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Ll1/s;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 36
    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 29
    new-instance v0, Ls0/b;

    invoke-direct {v0, p1}, Ls0/b;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf1/y;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 33
    new-instance p1, Lf1/t;

    invoke-direct {p1}, Lf1/t;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lf1/y;I)V
    .locals 0

    const/16 p2, 0x12

    iput p2, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 30
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/a0;-><init>(Lf1/y;)V

    return-void
.end method

.method public constructor <init>(Lh3/g0;)V
    .locals 3

    const/16 v0, 0x14

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 51
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance p1, Lf1/s;

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lf1/s;-><init>([BILjava/lang/Object;)V

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p3, p0, Landroidx/appcompat/widget/a0;->a:I

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 50
    invoke-direct {p0, v0, p1, p2}, Landroidx/appcompat/widget/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 40
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 41
    new-array v1, v0, [F

    iput-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 42
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 43
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ld2/g0;

    iput-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public static M(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, "x"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p0, "], "

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public final A(ILv1/w;Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lq0/o;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p0, p1, p3, v1}, Lq0/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final B(ILv1/w;Lv1/n;Lv1/s;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lj1/a1;

    .line 10
    .line 11
    iget-object p1, p1, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance p2, Lj1/v0;

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    move-object v0, p2

    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    invoke-direct/range {v0 .. v5}, Lj1/v0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;Lv1/n;Lv1/s;I)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Lf1/x;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final C(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0, v1, p1}, Landroidx/appcompat/widget/a0;->M(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final D(ILv1/w;Lv1/n;Lv1/s;Ljava/io/IOException;Z)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lj1/a1;

    .line 10
    .line 11
    iget-object p1, p1, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance p2, Lj1/x0;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    move-object v0, p2

    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    move-object v5, p5

    .line 21
    move v6, p6

    .line 22
    invoke-direct/range {v0 .. v7}, Lj1/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lv1/n;Lv1/s;Ljava/io/IOException;ZI)V

    .line 23
    .line 24
    .line 25
    check-cast p1, Lf1/x;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final E()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf1/t;

    .line 4
    .line 5
    sget-object v1, Lf1/b0;->f:[B

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    array-length v2, v1

    .line 11
    invoke-virtual {v0, v1, v2}, Lf1/t;->E([BI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final F(ILv1/w;Lv1/n;Lv1/s;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lj1/a1;

    .line 10
    .line 11
    iget-object p1, p1, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance p2, Lj1/v0;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v0, p2

    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    invoke-direct/range {v0 .. v5}, Lj1/v0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;Lv1/n;Lv1/s;I)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Lf1/x;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final G()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public final H(Ld2/r;Lh3/i0;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, [Ld2/g0;

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-ge v1, v2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p2}, Lh3/i0;->a()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lh3/i0;->b()V

    .line 14
    .line 15
    .line 16
    iget v2, p2, Lh3/i0;->d:I

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-interface {p1, v2, v3}, Ld2/r;->i(II)Ld2/g0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lc1/v;

    .line 32
    .line 33
    iget-object v4, v3, Lc1/v;->m:Ljava/lang/String;

    .line 34
    .line 35
    const-string v5, "application/cea-608"

    .line 36
    .line 37
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    const-string v5, "application/cea-708"

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    move v5, v0

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    const/4 v5, 0x1

    .line 55
    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v7, "Invalid closed caption MIME type provided: "

    .line 58
    .line 59
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v6, v5}, Lw7/b;->f(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    iget-object v5, v3, Lc1/v;->a:Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-virtual {p2}, Lh3/i0;->b()V

    .line 78
    .line 79
    .line 80
    iget-object v5, p2, Lh3/i0;->e:Ljava/lang/String;

    .line 81
    .line 82
    :goto_3
    new-instance v6, Lc1/u;

    .line 83
    .line 84
    invoke-direct {v6}, Lc1/u;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v5, v6, Lc1/u;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v6, v4}, Lc1/u;->e(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget v4, v3, Lc1/v;->e:I

    .line 93
    .line 94
    iput v4, v6, Lc1/u;->e:I

    .line 95
    .line 96
    iget-object v4, v3, Lc1/v;->d:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v4, v6, Lc1/u;->d:Ljava/lang/String;

    .line 99
    .line 100
    iget v4, v3, Lc1/v;->E:I

    .line 101
    .line 102
    iput v4, v6, Lc1/u;->D:I

    .line 103
    .line 104
    iget-object v3, v3, Lc1/v;->o:Ljava/util/List;

    .line 105
    .line 106
    iput-object v3, v6, Lc1/u;->n:Ljava/util/List;

    .line 107
    .line 108
    new-instance v3, Lc1/v;

    .line 109
    .line 110
    invoke-direct {v3, v6}, Lc1/v;-><init>(Lc1/u;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v2, v3}, Ld2/g0;->b(Lc1/v;)V

    .line 114
    .line 115
    .line 116
    iget-object v3, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, [Ld2/g0;

    .line 119
    .line 120
    aput-object v2, v3, v1

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    return-void
.end method

.method public final I(Lj1/f;)V
    .locals 3

    .line 1
    monitor-enter p1

    .line 2
    monitor-exit p1

    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, Ll1/m;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v2}, Ll1/m;-><init>(Landroidx/appcompat/widget/a0;Lj1/f;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final J(Ln2/a;)[B
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/ByteArrayOutputStream;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/io/DataOutputStream;

    .line 11
    .line 12
    iget-object v1, p1, Ln2/a;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Ln2/a;->b:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, ""

    .line 27
    .line 28
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/io/DataOutputStream;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/io/DataOutputStream;

    .line 41
    .line 42
    iget-wide v1, p1, Ln2/a;->c:J

    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/io/DataOutputStream;

    .line 50
    .line 51
    iget-wide v1, p1, Ln2/a;->d:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/io/DataOutputStream;

    .line 59
    .line 60
    iget-object p1, p1, Ln2/a;->e:[B

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Ljava/io/DataOutputStream;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->flush()V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ljava/io/ByteArrayOutputStream;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    return-object p1

    .line 81
    :catch_0
    move-exception p1

    .line 82
    new-instance v0, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw v0
.end method

.method public final K(Ly3/k;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ly3/f;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly3/f;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ly3/f;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Ly3/k;->a()V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v0, Ly3/f;->d:Ly3/f;

    .line 30
    .line 31
    iget-object v1, v0, Ly3/f;->c:Ly3/f;

    .line 32
    .line 33
    iput-object v1, p1, Ly3/f;->c:Ly3/f;

    .line 34
    .line 35
    iget-object v1, v0, Ly3/f;->c:Ly3/f;

    .line 36
    .line 37
    iput-object p1, v1, Ly3/f;->d:Ly3/f;

    .line 38
    .line 39
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ly3/f;

    .line 42
    .line 43
    iput-object p1, v0, Ly3/f;->d:Ly3/f;

    .line 44
    .line 45
    iget-object p1, p1, Ly3/f;->c:Ly3/f;

    .line 46
    .line 47
    iput-object p1, v0, Ly3/f;->c:Ly3/f;

    .line 48
    .line 49
    iput-object v0, p1, Ly3/f;->d:Ly3/f;

    .line 50
    .line 51
    iget-object p1, v0, Ly3/f;->d:Ly3/f;

    .line 52
    .line 53
    iput-object v0, p1, Ly3/f;->c:Ly3/f;

    .line 54
    .line 55
    iget-object p1, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    const/4 p1, 0x0

    .line 65
    :goto_1
    if-lez p1, :cond_2

    .line 66
    .line 67
    iget-object v0, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    add-int/lit8 p1, p1, -0x1

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 p1, 0x0

    .line 77
    :goto_2
    return-object p1
.end method

.method public final L(ILv1/w;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/w0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lj1/w0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final N(ILv1/w;)Landroid/util/Pair;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lj1/z0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    iget-object v3, v1, Lj1/z0;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    iget-object v3, v1, Lj1/z0;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lv1/w;

    .line 24
    .line 25
    iget-wide v3, v3, Lv1/w;->d:J

    .line 26
    .line 27
    iget-wide v5, p2, Lv1/w;->d:J

    .line 28
    .line 29
    cmp-long v3, v3, v5

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    iget-object v1, v1, Lj1/z0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    sget v2, Lj1/f1;->k:I

    .line 36
    .line 37
    iget-object v2, p2, Lv1/w;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2, v1}, Lv1/w;->a(Ljava/lang/Object;)Lv1/w;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p2, v0

    .line 52
    :goto_1
    if-nez p2, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    move-object v0, p2

    .line 56
    :cond_3
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, Lj1/z0;

    .line 59
    .line 60
    iget p2, p2, Lj1/z0;->d:I

    .line 61
    .line 62
    add-int/2addr p1, p2

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public final O(ILv1/w;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/w0;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lj1/w0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final synthetic P()V
    .locals 0

    .line 1
    return-void
.end method

.method public final Q(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ls0/b;

    .line 10
    .line 11
    iget-object v0, v0, Ls0/b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lj6/e;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lj6/e;->p(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    return-object p1
.end method

.method public final R(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Le/a;->i:[I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/16 p2, 0xe

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ls0/b;

    .line 35
    .line 36
    iget-object p1, p1, Ls0/b;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lj6/e;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Lj6/e;->z(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception p2

    .line 45
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 46
    .line 47
    .line 48
    throw p2
.end method

.method public final S(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls0/b;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, v0, Ls0/b;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lj6/e;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lj6/e;->u(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    return-object p1
.end method

.method public final T(Ld0/f;)V
    .locals 4

    .line 1
    iget v0, p1, Ld0/f;->b:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    if-eqz v2, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lf/p0;

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v3, Ld0/a;

    .line 20
    .line 21
    iget-object p1, p1, Ld0/f;->a:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-direct {v3, p0, v0, p1, v1}, Ld0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lf/p0;

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Landroid/os/Handler;

    .line 37
    .line 38
    new-instance v2, La/d;

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-direct {v2, p0, p1, v0, v3}, La/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    :goto_1
    return-void
.end method

.method public final U(Ly3/k;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ly3/f;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ly3/f;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ly3/f;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Ly3/f;->d:Ly3/f;

    .line 19
    .line 20
    iget-object v2, v0, Ly3/f;->c:Ly3/f;

    .line 21
    .line 22
    iput-object v2, v1, Ly3/f;->c:Ly3/f;

    .line 23
    .line 24
    iget-object v2, v0, Ly3/f;->c:Ly3/f;

    .line 25
    .line 26
    iput-object v1, v2, Ly3/f;->d:Ly3/f;

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ly3/f;

    .line 31
    .line 32
    iget-object v2, v1, Ly3/f;->d:Ly3/f;

    .line 33
    .line 34
    iput-object v2, v0, Ly3/f;->d:Ly3/f;

    .line 35
    .line 36
    iput-object v1, v0, Ly3/f;->c:Ly3/f;

    .line 37
    .line 38
    iput-object v0, v1, Ly3/f;->d:Ly3/f;

    .line 39
    .line 40
    iget-object v1, v0, Ly3/f;->d:Ly3/f;

    .line 41
    .line 42
    iput-object v0, v1, Ly3/f;->c:Ly3/f;

    .line 43
    .line 44
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-interface {p1}, Ly3/k;->a()V

    .line 53
    .line 54
    .line 55
    :goto_0
    iget-object p1, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    new-instance p1, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 65
    .line 66
    :cond_1
    iget-object p1, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final V(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Removed the wrong lock, expected to remove: "

    .line 2
    .line 3
    const-string v1, "Cannot release a lock that is not held, safeKey: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-static {v2}, Lw7/b;->q(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    check-cast v2, Lz3/b;

    .line 18
    .line 19
    iget v3, v2, Lz3/b;->b:I

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-lt v3, v4, :cond_2

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    iput v3, v2, Lz3/b;->b:I

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lz3/b;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lz3/c;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Lz3/c;->b(Lz3/b;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    new-instance v4, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", but actually removed: "

    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", safeKey: "

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v3

    .line 87
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    iget-object p1, v2, Lz3/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    new-instance v3, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, ", interestedThreads: "

    .line 105
    .line 106
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget p1, v2, Lz3/b;->b:I

    .line 110
    .line 111
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    throw p1
.end method

.method public final W()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly3/f;

    .line 4
    .line 5
    iget-object v0, v0, Ly3/f;->d:Ly3/f;

    .line 6
    .line 7
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ly3/f;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_3

    .line 17
    .line 18
    iget-object v1, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_1
    if-lez v1, :cond_1

    .line 29
    .line 30
    iget-object v2, v0, Ly3/f;->b:Ljava/util/ArrayList;

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_1
    if-eqz v2, :cond_2

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_2
    iget-object v1, v0, Ly3/f;->d:Ly3/f;

    .line 42
    .line 43
    iget-object v2, v0, Ly3/f;->c:Ly3/f;

    .line 44
    .line 45
    iput-object v2, v1, Ly3/f;->c:Ly3/f;

    .line 46
    .line 47
    iget-object v2, v0, Ly3/f;->c:Ly3/f;

    .line 48
    .line 49
    iput-object v1, v2, Ly3/f;->d:Ly3/f;

    .line 50
    .line 51
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/Map;

    .line 54
    .line 55
    iget-object v2, v0, Ly3/f;->a:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    check-cast v2, Ly3/k;

    .line 61
    .line 62
    invoke-interface {v2}, Ly3/k;->a()V

    .line 63
    .line 64
    .line 65
    iget-object v0, v0, Ly3/f;->d:Ly3/f;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v2
.end method

.method public final a(Lv3/e;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ly3/h;

    .line 14
    .line 15
    invoke-interface {p1, v0, v1}, Lv3/e;->b(Ljava/nio/ByteBuffer;Ly3/h;)I

    .line 16
    .line 17
    .line 18
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    invoke-static {v0}, Lp4/b;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    invoke-static {v0}, Lp4/b;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :goto_0
    :try_start_1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/io/InputStream;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ly3/h;

    .line 43
    .line 44
    invoke-interface {p1, v0, v1}, Lv3/e;->c(Ljava/io/InputStream;Ly3/h;)I

    .line 45
    .line 46
    .line 47
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/io/InputStream;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 53
    .line 54
    .line 55
    return p1

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/io/InputStream;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public final b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly3/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Le0/j;->e()Ly3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ly3/b;

    .line 10
    .line 11
    iput p1, v0, Ly3/b;->b:I

    .line 12
    .line 13
    iput p2, v0, Ly3/b;->c:I

    .line 14
    .line 15
    iput-object p3, v0, Ly3/b;->d:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Landroidx/appcompat/widget/a0;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/a0;->K(Ly3/k;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroid/graphics/Bitmap;

    .line 26
    .line 27
    return-object p1
.end method

.method public final c(Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly3/c;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0}, Le0/j;->e()Ly3/k;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ly3/b;

    .line 22
    .line 23
    iput v1, v0, Ly3/b;->b:I

    .line 24
    .line 25
    iput v2, v0, Ly3/b;->c:I

    .line 26
    .line 27
    iput-object v3, v0, Ly3/b;->d:Landroid/graphics/Bitmap$Config;

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroidx/appcompat/widget/a0;

    .line 32
    .line 33
    invoke-virtual {v1, v0, p1}, Landroidx/appcompat/widget/a0;->U(Ly3/k;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final d(Lf1/t;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lf1/t;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lf1/t;->v()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    and-int/lit16 v0, v0, 0x80

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x6

    .line 18
    invoke-virtual {p1, v0}, Lf1/t;->H(I)V

    .line 19
    .line 20
    .line 21
    iget v0, p1, Lf1/t;->c:I

    .line 22
    .line 23
    iget v1, p1, Lf1/t;->b:I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    const/4 v1, 0x4

    .line 27
    div-int/2addr v0, v1

    .line 28
    const/4 v2, 0x0

    .line 29
    move v3, v2

    .line 30
    :goto_0
    if-ge v3, v0, :cond_4

    .line 31
    .line 32
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Lf1/s;

    .line 35
    .line 36
    iget-object v5, v4, Lf1/s;->b:[B

    .line 37
    .line 38
    invoke-virtual {p1, v5, v2, v1}, Lf1/t;->d([BII)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v2}, Lf1/s;->o(I)V

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lf1/s;

    .line 47
    .line 48
    const/16 v5, 0x10

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Lf1/s;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    iget-object v5, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Lf1/s;

    .line 57
    .line 58
    const/4 v6, 0x3

    .line 59
    invoke-virtual {v5, v6}, Lf1/s;->r(I)V

    .line 60
    .line 61
    .line 62
    const/16 v5, 0xd

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Lf1/s;

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lf1/s;->r(I)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Lf1/s;

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Lf1/s;->i(I)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget-object v5, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Lh3/g0;

    .line 85
    .line 86
    iget-object v5, v5, Lh3/g0;->h:Landroid/util/SparseArray;

    .line 87
    .line 88
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-nez v5, :cond_3

    .line 93
    .line 94
    iget-object v5, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Lh3/g0;

    .line 97
    .line 98
    iget-object v6, v5, Lh3/g0;->h:Landroid/util/SparseArray;

    .line 99
    .line 100
    new-instance v7, Lh3/d0;

    .line 101
    .line 102
    new-instance v8, Lh3/f0;

    .line 103
    .line 104
    invoke-direct {v8, v5, v4}, Lh3/f0;-><init>(Lh3/g0;I)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v7, v8}, Lh3/d0;-><init>(Lh3/c0;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v4, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v4, Lh3/g0;

    .line 116
    .line 117
    iget v5, v4, Lh3/g0;->n:I

    .line 118
    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    iput v5, v4, Lh3/g0;->n:I

    .line 122
    .line 123
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p1, Lh3/g0;

    .line 129
    .line 130
    iget v0, p1, Lh3/g0;->a:I

    .line 131
    .line 132
    const/4 v1, 0x2

    .line 133
    if-eq v0, v1, :cond_5

    .line 134
    .line 135
    iget-object p1, p1, Lh3/g0;->h:Landroid/util/SparseArray;

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 138
    .line 139
    .line 140
    :cond_5
    return-void
.end method

.method public final e(Lf1/y;Ld2/r;Lh3/i0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic f()V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(ILv1/w;Lv1/s;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/u0;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, p1, p3, v1}, Lj1/u0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;Lv1/s;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final h(Landroid/net/Uri;Lh1/j;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz1/q;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lz1/q;->h(Landroid/net/Uri;Lh1/j;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/a;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1, p2}, Lu1/a;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lu1/a;

    .line 33
    .line 34
    :cond_1
    :goto_0
    return-object p1
.end method

.method public final i(ILv1/w;Lv1/s;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/u0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, p1, p3, v1}, Lj1/u0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;Lv1/s;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final j(Lq1/l;Lq1/i;)Lz1/q;
    .locals 2

    .line 1
    new-instance v0, Landroidx/appcompat/widget/a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lq1/p;

    .line 6
    .line 7
    invoke-interface {v1, p1, p2}, Lq1/p;->j(Lq1/l;Lq1/i;)Lz1/q;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/List;

    .line 14
    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    invoke-direct {v0, v1, p1, p2}, Landroidx/appcompat/widget/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final synthetic k([BLf/r0;Lw/f;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lr/f;->a(Ly2/l;[BLf/r0;Lw/f;)V

    return-void
.end method

.method public final l(ILv1/w;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/w0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lj1/w0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final m(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Landroidx/appcompat/widget/a0;->M(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final n(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx3/i0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lb4/w;

    .line 8
    .line 9
    iget-object v0, v0, Lx3/i0;->f:Lb4/w;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lx3/i0;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lb4/w;

    .line 27
    .line 28
    iget-object v2, v0, Lx3/i0;->b:Lx3/g;

    .line 29
    .line 30
    iget-object v0, v0, Lx3/i0;->x:Lx3/f;

    .line 31
    .line 32
    iget-object v1, v1, Lb4/w;->c:Lcom/bumptech/glide/load/data/e;

    .line 33
    .line 34
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->d()Lv3/a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v2, v0, p1, v1, v3}, Lx3/g;->d(Lv3/i;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/e;Lv3/a;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final o([BIILf/r0;Lf1/c;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lf1/t;

    .line 8
    .line 9
    add-int v3, v0, p3

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v2, v4, v3}, Lf1/t;->E([BI)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lf1/t;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Lf1/t;->G(I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget-object v2, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lf1/t;

    .line 31
    .line 32
    invoke-static {v2}, Lg3/i;->d(Lf1/t;)V
    :try_end_0
    .catch Lc1/r0; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v2, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Lf1/t;

    .line 38
    .line 39
    invoke-virtual {v2}, Lf1/t;->g()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    :cond_1
    :goto_1
    iget-object v3, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lf1/t;

    .line 58
    .line 59
    const/4 v4, -0x1

    .line 60
    const/4 v5, 0x0

    .line 61
    move v6, v4

    .line 62
    move v7, v5

    .line 63
    :goto_2
    const/4 v9, 0x2

    .line 64
    const/4 v10, 0x1

    .line 65
    if-ne v6, v4, :cond_5

    .line 66
    .line 67
    iget v7, v3, Lf1/t;->b:I

    .line 68
    .line 69
    invoke-virtual {v3}, Lf1/t;->g()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-nez v6, :cond_2

    .line 74
    .line 75
    move v6, v5

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const-string v11, "STYLE"

    .line 78
    .line 79
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-eqz v11, :cond_3

    .line 84
    .line 85
    move v6, v9

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    const-string v9, "NOTE"

    .line 88
    .line 89
    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_4

    .line 94
    .line 95
    move v6, v10

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/4 v6, 0x3

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-virtual {v3, v7}, Lf1/t;->G(I)V

    .line 100
    .line 101
    .line 102
    if-eqz v6, :cond_41

    .line 103
    .line 104
    if-ne v6, v10, :cond_6

    .line 105
    .line 106
    iget-object v3, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Lf1/t;

    .line 109
    .line 110
    :goto_3
    invoke-virtual {v3}, Lf1/t;->g()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    if-ne v6, v9, :cond_3c

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_3b

    .line 128
    .line 129
    iget-object v6, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v6, Lf1/t;

    .line 132
    .line 133
    invoke-virtual {v6}, Lf1/t;->g()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    iget-object v6, v1, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Lg3/a;

    .line 139
    .line 140
    iget-object v7, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v7, Lf1/t;

    .line 143
    .line 144
    iget-object v11, v6, Lg3/a;->b:Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 147
    .line 148
    .line 149
    iget v12, v7, Lf1/t;->b:I

    .line 150
    .line 151
    :cond_7
    invoke-virtual {v7}, Lf1/t;->g()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v13

    .line 155
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-eqz v13, :cond_7

    .line 160
    .line 161
    iget-object v13, v7, Lf1/t;->a:[B

    .line 162
    .line 163
    iget v7, v7, Lf1/t;->b:I

    .line 164
    .line 165
    iget-object v6, v6, Lg3/a;->a:Lf1/t;

    .line 166
    .line 167
    invoke-virtual {v6, v13, v7}, Lf1/t;->E([BI)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v12}, Lf1/t;->G(I)V

    .line 171
    .line 172
    .line 173
    new-instance v7, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    :goto_4
    invoke-static {v6}, Lg3/a;->c(Lf1/t;)V

    .line 179
    .line 180
    .line 181
    iget v12, v6, Lf1/t;->c:I

    .line 182
    .line 183
    iget v13, v6, Lf1/t;->b:I

    .line 184
    .line 185
    sub-int/2addr v12, v13

    .line 186
    const-string v13, "{"

    .line 187
    .line 188
    const-string v14, ""

    .line 189
    .line 190
    const/4 v15, 0x5

    .line 191
    if-ge v12, v15, :cond_8

    .line 192
    .line 193
    goto/16 :goto_8

    .line 194
    .line 195
    :cond_8
    invoke-virtual {v6, v15}, Lf1/t;->s(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    const-string v15, "::cue"

    .line 200
    .line 201
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    if-nez v12, :cond_9

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_9
    iget v12, v6, Lf1/t;->b:I

    .line 209
    .line 210
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    if-nez v15, :cond_a

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_a
    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v16

    .line 221
    if-eqz v16, :cond_b

    .line 222
    .line 223
    invoke-virtual {v6, v12}, Lf1/t;->G(I)V

    .line 224
    .line 225
    .line 226
    move-object v3, v14

    .line 227
    goto :goto_9

    .line 228
    :cond_b
    const-string v12, "("

    .line 229
    .line 230
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    if-eqz v12, :cond_e

    .line 235
    .line 236
    iget v12, v6, Lf1/t;->b:I

    .line 237
    .line 238
    iget v15, v6, Lf1/t;->c:I

    .line 239
    .line 240
    move/from16 v16, v5

    .line 241
    .line 242
    :goto_5
    if-ge v12, v15, :cond_d

    .line 243
    .line 244
    if-nez v16, :cond_d

    .line 245
    .line 246
    iget-object v3, v6, Lf1/t;->a:[B

    .line 247
    .line 248
    add-int/lit8 v16, v12, 0x1

    .line 249
    .line 250
    aget-byte v3, v3, v12

    .line 251
    .line 252
    int-to-char v3, v3

    .line 253
    const/16 v12, 0x29

    .line 254
    .line 255
    if-ne v3, v12, :cond_c

    .line 256
    .line 257
    move v3, v10

    .line 258
    goto :goto_6

    .line 259
    :cond_c
    move v3, v5

    .line 260
    :goto_6
    move/from16 v12, v16

    .line 261
    .line 262
    move/from16 v16, v3

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_d
    add-int/lit8 v12, v12, -0x1

    .line 266
    .line 267
    iget v3, v6, Lf1/t;->b:I

    .line 268
    .line 269
    sub-int/2addr v12, v3

    .line 270
    invoke-virtual {v6, v12}, Lf1/t;->s(I)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    goto :goto_7

    .line 279
    :cond_e
    const/4 v3, 0x0

    .line 280
    :goto_7
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    const-string v15, ")"

    .line 285
    .line 286
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    if-nez v12, :cond_f

    .line 291
    .line 292
    :goto_8
    const/4 v3, 0x0

    .line 293
    :cond_f
    :goto_9
    if-eqz v3, :cond_3a

    .line 294
    .line 295
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v12

    .line 303
    if-nez v12, :cond_10

    .line 304
    .line 305
    goto/16 :goto_1e

    .line 306
    .line 307
    :cond_10
    new-instance v12, Lg3/b;

    .line 308
    .line 309
    invoke-direct {v12}, Lg3/b;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v13

    .line 316
    if-eqz v13, :cond_11

    .line 317
    .line 318
    goto :goto_c

    .line 319
    :cond_11
    const/16 v13, 0x5b

    .line 320
    .line 321
    invoke-virtual {v3, v13}, Ljava/lang/String;->indexOf(I)I

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eq v13, v4, :cond_13

    .line 326
    .line 327
    sget-object v15, Lg3/a;->c:Ljava/util/regex/Pattern;

    .line 328
    .line 329
    invoke-virtual {v3, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    invoke-virtual {v15, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->matches()Z

    .line 338
    .line 339
    .line 340
    move-result v15

    .line 341
    if-eqz v15, :cond_12

    .line 342
    .line 343
    invoke-virtual {v8, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iput-object v8, v12, Lg3/b;->d:Ljava/lang/String;

    .line 351
    .line 352
    :cond_12
    invoke-virtual {v3, v5, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    :cond_13
    sget v8, Lf1/b0;->a:I

    .line 357
    .line 358
    const-string v8, "\\."

    .line 359
    .line 360
    invoke-virtual {v3, v8, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    aget-object v8, v3, v5

    .line 365
    .line 366
    const/16 v13, 0x23

    .line 367
    .line 368
    invoke-virtual {v8, v13}, Ljava/lang/String;->indexOf(I)I

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    if-eq v13, v4, :cond_14

    .line 373
    .line 374
    invoke-virtual {v8, v5, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v15

    .line 378
    iput-object v15, v12, Lg3/b;->b:Ljava/lang/String;

    .line 379
    .line 380
    add-int/lit8 v13, v13, 0x1

    .line 381
    .line 382
    invoke-virtual {v8, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    iput-object v8, v12, Lg3/b;->a:Ljava/lang/String;

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_14
    iput-object v8, v12, Lg3/b;->b:Ljava/lang/String;

    .line 390
    .line 391
    :goto_a
    array-length v8, v3

    .line 392
    if-le v8, v10, :cond_16

    .line 393
    .line 394
    array-length v8, v3

    .line 395
    array-length v13, v3

    .line 396
    if-gt v8, v13, :cond_15

    .line 397
    .line 398
    move v13, v10

    .line 399
    goto :goto_b

    .line 400
    :cond_15
    move v13, v5

    .line 401
    :goto_b
    invoke-static {v13}, Lw7/b;->g(Z)V

    .line 402
    .line 403
    .line 404
    invoke-static {v3, v10, v8}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, [Ljava/lang/String;

    .line 409
    .line 410
    new-instance v8, Ljava/util/HashSet;

    .line 411
    .line 412
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-direct {v8, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 417
    .line 418
    .line 419
    iput-object v8, v12, Lg3/b;->c:Ljava/util/Set;

    .line 420
    .line 421
    :cond_16
    :goto_c
    move v3, v5

    .line 422
    const/4 v8, 0x0

    .line 423
    :goto_d
    const-string v13, "}"

    .line 424
    .line 425
    if-nez v3, :cond_38

    .line 426
    .line 427
    iget v3, v6, Lf1/t;->b:I

    .line 428
    .line 429
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v8

    .line 433
    if-eqz v8, :cond_18

    .line 434
    .line 435
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v15

    .line 439
    if-eqz v15, :cond_17

    .line 440
    .line 441
    goto :goto_e

    .line 442
    :cond_17
    move v15, v5

    .line 443
    goto :goto_f

    .line 444
    :cond_18
    :goto_e
    move v15, v10

    .line 445
    :goto_f
    if-nez v15, :cond_37

    .line 446
    .line 447
    invoke-virtual {v6, v3}, Lf1/t;->G(I)V

    .line 448
    .line 449
    .line 450
    invoke-static {v6}, Lg3/a;->c(Lf1/t;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v6, v11}, Lg3/a;->a(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v16

    .line 461
    if-eqz v16, :cond_19

    .line 462
    .line 463
    goto/16 :goto_1c

    .line 464
    .line 465
    :cond_19
    const-string v4, ":"

    .line 466
    .line 467
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-nez v4, :cond_1a

    .line 476
    .line 477
    goto/16 :goto_1c

    .line 478
    .line 479
    :cond_1a
    invoke-static {v6}, Lg3/a;->c(Lf1/t;)V

    .line 480
    .line 481
    .line 482
    new-instance v4, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 485
    .line 486
    .line 487
    const/4 v5, 0x0

    .line 488
    :goto_10
    const-string v9, ";"

    .line 489
    .line 490
    if-nez v5, :cond_1e

    .line 491
    .line 492
    iget v10, v6, Lf1/t;->b:I

    .line 493
    .line 494
    move/from16 v17, v5

    .line 495
    .line 496
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    if-nez v5, :cond_1b

    .line 501
    .line 502
    const/4 v4, 0x0

    .line 503
    goto :goto_13

    .line 504
    :cond_1b
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v18

    .line 508
    if-nez v18, :cond_1d

    .line 509
    .line 510
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result v9

    .line 514
    if-eqz v9, :cond_1c

    .line 515
    .line 516
    goto :goto_11

    .line 517
    :cond_1c
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    move/from16 v5, v17

    .line 521
    .line 522
    goto :goto_12

    .line 523
    :cond_1d
    :goto_11
    invoke-virtual {v6, v10}, Lf1/t;->G(I)V

    .line 524
    .line 525
    .line 526
    const/4 v5, 0x1

    .line 527
    :goto_12
    const/4 v10, 0x1

    .line 528
    goto :goto_10

    .line 529
    :cond_1e
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    :goto_13
    if-eqz v4, :cond_36

    .line 534
    .line 535
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    if-eqz v5, :cond_1f

    .line 540
    .line 541
    goto/16 :goto_1a

    .line 542
    .line 543
    :cond_1f
    iget v5, v6, Lf1/t;->b:I

    .line 544
    .line 545
    invoke-static {v6, v11}, Lg3/a;->b(Lf1/t;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v10

    .line 549
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    if-eqz v9, :cond_20

    .line 554
    .line 555
    goto :goto_14

    .line 556
    :cond_20
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v9

    .line 560
    if-eqz v9, :cond_36

    .line 561
    .line 562
    invoke-virtual {v6, v5}, Lf1/t;->G(I)V

    .line 563
    .line 564
    .line 565
    :goto_14
    const-string v5, "color"

    .line 566
    .line 567
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    if-eqz v5, :cond_21

    .line 572
    .line 573
    const/4 v5, 0x1

    .line 574
    invoke-static {v4, v5}, Lf1/b;->a(Ljava/lang/String;Z)I

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    iput v3, v12, Lg3/b;->f:I

    .line 579
    .line 580
    iput-boolean v5, v12, Lg3/b;->g:Z

    .line 581
    .line 582
    goto/16 :goto_1a

    .line 583
    .line 584
    :cond_21
    const/4 v5, 0x1

    .line 585
    const-string v9, "background-color"

    .line 586
    .line 587
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v9

    .line 591
    if-eqz v9, :cond_22

    .line 592
    .line 593
    invoke-static {v4, v5}, Lf1/b;->a(Ljava/lang/String;Z)I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    iput v3, v12, Lg3/b;->h:I

    .line 598
    .line 599
    iput-boolean v5, v12, Lg3/b;->i:Z

    .line 600
    .line 601
    goto/16 :goto_1a

    .line 602
    .line 603
    :cond_22
    const-string v9, "ruby-position"

    .line 604
    .line 605
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v9

    .line 609
    if-eqz v9, :cond_24

    .line 610
    .line 611
    const-string v3, "over"

    .line 612
    .line 613
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-eqz v3, :cond_23

    .line 618
    .line 619
    iput v5, v12, Lg3/b;->p:I

    .line 620
    .line 621
    goto/16 :goto_1a

    .line 622
    .line 623
    :cond_23
    const-string v3, "under"

    .line 624
    .line 625
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-eqz v3, :cond_36

    .line 630
    .line 631
    const/4 v3, 0x2

    .line 632
    iput v3, v12, Lg3/b;->p:I

    .line 633
    .line 634
    move v9, v3

    .line 635
    const/4 v4, 0x1

    .line 636
    goto/16 :goto_1d

    .line 637
    .line 638
    :cond_24
    const-string v5, "text-combine-upright"

    .line 639
    .line 640
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v5

    .line 644
    if-eqz v5, :cond_27

    .line 645
    .line 646
    const-string v3, "all"

    .line 647
    .line 648
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-nez v3, :cond_26

    .line 653
    .line 654
    const-string v3, "digits"

    .line 655
    .line 656
    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    if-eqz v3, :cond_25

    .line 661
    .line 662
    goto :goto_15

    .line 663
    :cond_25
    const/4 v3, 0x0

    .line 664
    goto :goto_16

    .line 665
    :cond_26
    :goto_15
    const/4 v3, 0x1

    .line 666
    :goto_16
    iput-boolean v3, v12, Lg3/b;->q:Z

    .line 667
    .line 668
    goto/16 :goto_1a

    .line 669
    .line 670
    :cond_27
    const-string v5, "text-decoration"

    .line 671
    .line 672
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    if-eqz v5, :cond_28

    .line 677
    .line 678
    const-string v3, "underline"

    .line 679
    .line 680
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-eqz v3, :cond_36

    .line 685
    .line 686
    const/4 v3, 0x1

    .line 687
    iput v3, v12, Lg3/b;->k:I

    .line 688
    .line 689
    move v4, v3

    .line 690
    goto/16 :goto_1b

    .line 691
    .line 692
    :cond_28
    const-string v5, "font-family"

    .line 693
    .line 694
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v5

    .line 698
    if-eqz v5, :cond_29

    .line 699
    .line 700
    invoke-static {v4}, Lj5/a;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    iput-object v3, v12, Lg3/b;->e:Ljava/lang/String;

    .line 705
    .line 706
    goto/16 :goto_1a

    .line 707
    .line 708
    :cond_29
    const-string v5, "font-weight"

    .line 709
    .line 710
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result v5

    .line 714
    if-eqz v5, :cond_2a

    .line 715
    .line 716
    const-string v3, "bold"

    .line 717
    .line 718
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    if-eqz v3, :cond_36

    .line 723
    .line 724
    const/4 v5, 0x1

    .line 725
    iput v5, v12, Lg3/b;->l:I

    .line 726
    .line 727
    goto/16 :goto_1a

    .line 728
    .line 729
    :cond_2a
    const/4 v5, 0x1

    .line 730
    const-string v9, "font-style"

    .line 731
    .line 732
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 733
    .line 734
    .line 735
    move-result v9

    .line 736
    if-eqz v9, :cond_2b

    .line 737
    .line 738
    const-string v3, "italic"

    .line 739
    .line 740
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 741
    .line 742
    .line 743
    move-result v3

    .line 744
    if-eqz v3, :cond_36

    .line 745
    .line 746
    iput v5, v12, Lg3/b;->m:I

    .line 747
    .line 748
    goto/16 :goto_1a

    .line 749
    .line 750
    :cond_2b
    const-string v5, "font-size"

    .line 751
    .line 752
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 753
    .line 754
    .line 755
    move-result v3

    .line 756
    if-eqz v3, :cond_36

    .line 757
    .line 758
    invoke-static {v4}, Lj5/a;->g0(Ljava/lang/String;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    sget-object v5, Lg3/a;->d:Ljava/util/regex/Pattern;

    .line 763
    .line 764
    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 769
    .line 770
    .line 771
    move-result v5

    .line 772
    if-nez v5, :cond_2c

    .line 773
    .line 774
    new-instance v3, Ljava/lang/StringBuilder;

    .line 775
    .line 776
    const-string v5, "Invalid font-size: \'"

    .line 777
    .line 778
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    .line 783
    .line 784
    const-string v4, "\'."

    .line 785
    .line 786
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    const-string v4, "WebvttCssParser"

    .line 794
    .line 795
    invoke-static {v4, v3}, Lf1/o;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_1a

    .line 799
    .line 800
    :cond_2c
    const/4 v4, 0x2

    .line 801
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 809
    .line 810
    .line 811
    move-result v4

    .line 812
    const/16 v9, 0x25

    .line 813
    .line 814
    if-eq v4, v9, :cond_31

    .line 815
    .line 816
    const/16 v9, 0xca8

    .line 817
    .line 818
    if-eq v4, v9, :cond_2f

    .line 819
    .line 820
    const/16 v9, 0xe08

    .line 821
    .line 822
    if-eq v4, v9, :cond_2d

    .line 823
    .line 824
    goto :goto_17

    .line 825
    :cond_2d
    const-string v4, "px"

    .line 826
    .line 827
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 828
    .line 829
    .line 830
    move-result v4

    .line 831
    if-nez v4, :cond_2e

    .line 832
    .line 833
    goto :goto_17

    .line 834
    :cond_2e
    const/4 v5, 0x2

    .line 835
    goto :goto_18

    .line 836
    :cond_2f
    const-string v4, "em"

    .line 837
    .line 838
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    move-result v4

    .line 842
    if-nez v4, :cond_30

    .line 843
    .line 844
    goto :goto_17

    .line 845
    :cond_30
    const/4 v5, 0x1

    .line 846
    goto :goto_18

    .line 847
    :cond_31
    const-string v4, "%"

    .line 848
    .line 849
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-nez v4, :cond_32

    .line 854
    .line 855
    :goto_17
    const/4 v5, -0x1

    .line 856
    goto :goto_18

    .line 857
    :cond_32
    const/4 v5, 0x0

    .line 858
    :goto_18
    if-eqz v5, :cond_35

    .line 859
    .line 860
    const/4 v4, 0x1

    .line 861
    if-eq v5, v4, :cond_34

    .line 862
    .line 863
    const/4 v9, 0x2

    .line 864
    if-ne v5, v9, :cond_33

    .line 865
    .line 866
    iput v4, v12, Lg3/b;->n:I

    .line 867
    .line 868
    goto :goto_19

    .line 869
    :cond_33
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 870
    .line 871
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 872
    .line 873
    .line 874
    throw v0

    .line 875
    :cond_34
    const/4 v9, 0x2

    .line 876
    iput v9, v12, Lg3/b;->n:I

    .line 877
    .line 878
    goto :goto_19

    .line 879
    :cond_35
    const/4 v4, 0x1

    .line 880
    const/4 v5, 0x3

    .line 881
    const/4 v9, 0x2

    .line 882
    iput v5, v12, Lg3/b;->n:I

    .line 883
    .line 884
    :goto_19
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 892
    .line 893
    .line 894
    move-result v3

    .line 895
    iput v3, v12, Lg3/b;->o:F

    .line 896
    .line 897
    goto :goto_1d

    .line 898
    :cond_36
    :goto_1a
    const/4 v4, 0x1

    .line 899
    :goto_1b
    const/4 v9, 0x2

    .line 900
    goto :goto_1d

    .line 901
    :cond_37
    :goto_1c
    move v4, v10

    .line 902
    :goto_1d
    move v10, v4

    .line 903
    move v3, v15

    .line 904
    const/4 v4, -0x1

    .line 905
    const/4 v5, 0x0

    .line 906
    goto/16 :goto_d

    .line 907
    .line 908
    :cond_38
    move v4, v10

    .line 909
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    if-eqz v3, :cond_39

    .line 914
    .line 915
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    :cond_39
    move v10, v4

    .line 919
    const/4 v4, -0x1

    .line 920
    const/4 v5, 0x0

    .line 921
    goto/16 :goto_4

    .line 922
    .line 923
    :cond_3a
    :goto_1e
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 924
    .line 925
    .line 926
    goto/16 :goto_1

    .line 927
    .line 928
    :cond_3b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 929
    .line 930
    const-string v2, "A style block was found after the first cue."

    .line 931
    .line 932
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    throw v0

    .line 936
    :cond_3c
    const/4 v3, 0x3

    .line 937
    if-ne v6, v3, :cond_1

    .line 938
    .line 939
    iget-object v3, v1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 940
    .line 941
    check-cast v3, Lf1/t;

    .line 942
    .line 943
    sget-object v4, Lg3/h;->a:Ljava/util/regex/Pattern;

    .line 944
    .line 945
    invoke-virtual {v3}, Lf1/t;->g()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    if-nez v4, :cond_3d

    .line 950
    .line 951
    const/4 v3, 0x0

    .line 952
    goto :goto_20

    .line 953
    :cond_3d
    sget-object v5, Lg3/h;->a:Ljava/util/regex/Pattern;

    .line 954
    .line 955
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 956
    .line 957
    .line 958
    move-result-object v6

    .line 959
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 960
    .line 961
    .line 962
    move-result v7

    .line 963
    if-eqz v7, :cond_3e

    .line 964
    .line 965
    const/4 v7, 0x0

    .line 966
    invoke-static {v7, v6, v3, v0}, Lg3/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lf1/t;Ljava/util/ArrayList;)Lg3/c;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    goto :goto_20

    .line 971
    :cond_3e
    const/4 v7, 0x0

    .line 972
    invoke-virtual {v3}, Lf1/t;->g()Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v6

    .line 976
    if-nez v6, :cond_3f

    .line 977
    .line 978
    goto :goto_1f

    .line 979
    :cond_3f
    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 984
    .line 985
    .line 986
    move-result v6

    .line 987
    if-eqz v6, :cond_40

    .line 988
    .line 989
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    invoke-static {v4, v5, v3, v0}, Lg3/h;->d(Ljava/lang/String;Ljava/util/regex/Matcher;Lf1/t;Ljava/util/ArrayList;)Lg3/c;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    goto :goto_20

    .line 998
    :cond_40
    :goto_1f
    move-object v3, v7

    .line 999
    :goto_20
    if-eqz v3, :cond_1

    .line 1000
    .line 1001
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_1

    .line 1005
    .line 1006
    :cond_41
    new-instance v0, Lg3/j;

    .line 1007
    .line 1008
    invoke-direct {v0, v2}, Lg3/j;-><init>(Ljava/util/ArrayList;)V

    .line 1009
    .line 1010
    .line 1011
    move-object/from16 v2, p4

    .line 1012
    .line 1013
    move-object/from16 v3, p5

    .line 1014
    .line 1015
    invoke-static {v0, v2, v3}, Lp7/a0;->b0(Ly2/d;Lf/r0;Lf1/c;)V

    .line 1016
    .line 1017
    .line 1018
    return-void

    .line 1019
    :catch_0
    move-exception v0

    .line 1020
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 1021
    .line 1022
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 1023
    .line 1024
    .line 1025
    throw v2
.end method

.method public final p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq3/s;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq3/s;->d()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(ILv1/w;Lv1/n;Lv1/s;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lj1/a1;

    .line 10
    .line 11
    iget-object p1, p1, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance p2, Lj1/v0;

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    move-object v0, p2

    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    invoke-direct/range {v0 .. v5}, Lj1/v0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;Lv1/n;Lv1/s;I)V

    .line 21
    .line 22
    .line 23
    check-cast p1, Lf1/x;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final synthetic r([BII)Ly2/d;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lr/f;->b(Ly2/l;[BII)Ly2/b;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx3/i0;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lb4/w;

    .line 8
    .line 9
    iget-object v0, v0, Lx3/i0;->f:Lb4/w;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lx3/i0;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lb4/w;

    .line 27
    .line 28
    iget-object v2, v0, Lx3/i0;->a:Lx3/i;

    .line 29
    .line 30
    iget-object v2, v2, Lx3/i;->p:Lx3/o;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object v3, v1, Lb4/w;->c:Lcom/bumptech/glide/load/data/e;

    .line 35
    .line 36
    invoke-interface {v3}, Lcom/bumptech/glide/load/data/e;->d()Lv3/a;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Lx3/o;->a(Lv3/a;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iput-object p1, v0, Lx3/i0;->e:Ljava/lang/Object;

    .line 47
    .line 48
    iget-object p1, v0, Lx3/i0;->b:Lx3/g;

    .line 49
    .line 50
    invoke-interface {p1}, Lx3/g;->a()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    iget-object v2, v0, Lx3/i0;->b:Lx3/g;

    .line 55
    .line 56
    iget-object v3, v1, Lb4/w;->a:Lv3/i;

    .line 57
    .line 58
    iget-object v4, v1, Lb4/w;->c:Lcom/bumptech/glide/load/data/e;

    .line 59
    .line 60
    invoke-interface {v4}, Lcom/bumptech/glide/load/data/e;->d()Lv3/a;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v6, v0, Lx3/i0;->x:Lx3/f;

    .line 65
    .line 66
    move-object v0, v2

    .line 67
    move-object v1, v3

    .line 68
    move-object v2, p1

    .line 69
    move-object v3, v4

    .line 70
    move-object v4, v5

    .line 71
    move-object v5, v6

    .line 72
    invoke-interface/range {v0 .. v5}, Lx3/g;->b(Lv3/i;Ljava/lang/Object;Lcom/bumptech/glide/load/data/e;Lv3/a;Lv3/i;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    return-void
.end method

.method public final t(Landroid/graphics/Bitmap;)I
    .locals 0

    .line 1
    invoke-static {p1}, Lp4/m;->c(Landroid/graphics/Bitmap;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/a0;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "GroupedLinkedMap( "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ly3/f;

    .line 21
    .line 22
    iget-object v1, v1, Ly3/f;->c:Ly3/f;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v2

    .line 26
    :goto_0
    iget-object v4, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ly3/f;

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    const/16 v3, 0x7b

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v3, v1, Ly3/f;->a:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 v3, 0x3a

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v3, v1, Ly3/f;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    move v3, v2

    .line 61
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v3, "}, "

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, v1, Ly3/f;->c:Ly3/f;

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    if-eqz v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/lit8 v1, v1, -0x2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :cond_2
    const-string v1, " )"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v1, "AttributeStrategy:\n  "

    .line 101
    .line 102
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Landroidx/appcompat/widget/a0;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0

    .line 117
    :sswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v1, "Bounds{lower="

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Lz/d;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, " upper="

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, Lz/d;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, "}"

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public final u()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/a0;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/a0;->W()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/graphics/Bitmap;

    .line 10
    .line 11
    return-object v0
.end method

.method public final v()Lz1/q;
    .locals 4

    .line 1
    new-instance v0, Landroidx/appcompat/widget/a0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lq1/p;

    .line 6
    .line 7
    invoke-interface {v1}, Lq1/p;->v()Lz1/q;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    const/16 v3, 0xd

    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, Landroidx/appcompat/widget/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final w(ILv1/w;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lj1/w0;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lj1/w0;-><init>(Landroidx/appcompat/widget/a0;Landroid/util/Pair;I)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final x()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final y(ILv1/w;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/widget/a0;->N(ILv1/w;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Lj1/a1;

    .line 10
    .line 11
    iget-object p2, p2, Lj1/a1;->i:Lf1/i;

    .line 12
    .line 13
    new-instance v0, Lf1/k;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p0, p1, p3, v1}, Lf1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    check-cast p2, Lf1/x;

    .line 20
    .line 21
    invoke-virtual {p2, v0}, Lf1/x;->c(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final z(Ld2/q;J)Ld2/g;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Ld2/q;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v5

    .line 7
    invoke-interface/range {p1 .. p1}, Ld2/q;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    sub-long/2addr v1, v5

    .line 12
    const-wide/16 v3, 0x4e20

    .line 13
    .line 14
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    long-to-int v1, v1

    .line 19
    iget-object v2, v0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lf1/t;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lf1/t;->D(I)V

    .line 24
    .line 25
    .line 26
    iget-object v2, v0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lf1/t;

    .line 29
    .line 30
    iget-object v2, v2, Lf1/t;->a:[B

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    move-object/from16 v4, p1

    .line 34
    .line 35
    invoke-interface {v4, v2, v3, v1}, Ld2/q;->n([BII)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lf1/t;

    .line 41
    .line 42
    const/4 v2, -0x1

    .line 43
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    move v7, v2

    .line 49
    move-wide v10, v3

    .line 50
    :goto_0
    iget v8, v1, Lf1/t;->c:I

    .line 51
    .line 52
    iget v9, v1, Lf1/t;->b:I

    .line 53
    .line 54
    sub-int/2addr v8, v9

    .line 55
    const/4 v12, 0x4

    .line 56
    if-lt v8, v12, :cond_e

    .line 57
    .line 58
    iget-object v8, v1, Lf1/t;->a:[B

    .line 59
    .line 60
    invoke-static {v8, v9}, Lh2/a;->d([BI)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    const/4 v9, 0x1

    .line 65
    const/16 v13, 0x1ba

    .line 66
    .line 67
    if-eq v8, v13, :cond_0

    .line 68
    .line 69
    invoke-virtual {v1, v9}, Lf1/t;->H(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v1, v12}, Lf1/t;->H(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Lh3/z;->c(Lf1/t;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v14

    .line 80
    cmp-long v2, v14, v3

    .line 81
    .line 82
    if-eqz v2, :cond_4

    .line 83
    .line 84
    iget-object v2, v0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Lf1/y;

    .line 87
    .line 88
    invoke-virtual {v2, v14, v15}, Lf1/y;->b(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v14

    .line 92
    cmp-long v2, v14, p2

    .line 93
    .line 94
    if-lez v2, :cond_2

    .line 95
    .line 96
    cmp-long v1, v10, v3

    .line 97
    .line 98
    if-nez v1, :cond_1

    .line 99
    .line 100
    new-instance v7, Ld2/g;

    .line 101
    .line 102
    const/4 v2, -0x1

    .line 103
    move-object v1, v7

    .line 104
    move-wide v3, v14

    .line 105
    invoke-direct/range {v1 .. v6}, Ld2/g;-><init>(IJJ)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :cond_1
    int-to-long v1, v7

    .line 111
    add-long/2addr v5, v1

    .line 112
    invoke-static {v5, v6}, Ld2/g;->b(J)Ld2/g;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    goto/16 :goto_3

    .line 117
    .line 118
    :cond_2
    const-wide/32 v7, 0x186a0

    .line 119
    .line 120
    .line 121
    add-long/2addr v7, v14

    .line 122
    cmp-long v2, v7, p2

    .line 123
    .line 124
    if-lez v2, :cond_3

    .line 125
    .line 126
    iget v1, v1, Lf1/t;->b:I

    .line 127
    .line 128
    int-to-long v1, v1

    .line 129
    add-long/2addr v5, v1

    .line 130
    invoke-static {v5, v6}, Ld2/g;->b(J)Ld2/g;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_3
    iget v2, v1, Lf1/t;->b:I

    .line 137
    .line 138
    move v7, v2

    .line 139
    move-wide v10, v14

    .line 140
    :cond_4
    iget v2, v1, Lf1/t;->c:I

    .line 141
    .line 142
    iget v8, v1, Lf1/t;->b:I

    .line 143
    .line 144
    sub-int v8, v2, v8

    .line 145
    .line 146
    const/16 v14, 0xa

    .line 147
    .line 148
    if-ge v8, v14, :cond_5

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Lf1/t;->G(I)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_2

    .line 154
    .line 155
    :cond_5
    const/16 v8, 0x9

    .line 156
    .line 157
    invoke-virtual {v1, v8}, Lf1/t;->H(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Lf1/t;->v()I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    and-int/lit8 v8, v8, 0x7

    .line 165
    .line 166
    iget v14, v1, Lf1/t;->c:I

    .line 167
    .line 168
    iget v15, v1, Lf1/t;->b:I

    .line 169
    .line 170
    sub-int/2addr v14, v15

    .line 171
    if-ge v14, v8, :cond_6

    .line 172
    .line 173
    invoke-virtual {v1, v2}, Lf1/t;->G(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    invoke-virtual {v1, v8}, Lf1/t;->H(I)V

    .line 178
    .line 179
    .line 180
    iget v8, v1, Lf1/t;->c:I

    .line 181
    .line 182
    iget v14, v1, Lf1/t;->b:I

    .line 183
    .line 184
    sub-int/2addr v8, v14

    .line 185
    if-ge v8, v12, :cond_7

    .line 186
    .line 187
    invoke-virtual {v1, v2}, Lf1/t;->G(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_7
    iget-object v8, v1, Lf1/t;->a:[B

    .line 192
    .line 193
    invoke-static {v8, v14}, Lh2/a;->d([BI)I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    const/16 v14, 0x1bb

    .line 198
    .line 199
    if-ne v8, v14, :cond_9

    .line 200
    .line 201
    invoke-virtual {v1, v12}, Lf1/t;->H(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Lf1/t;->A()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    iget v14, v1, Lf1/t;->c:I

    .line 209
    .line 210
    iget v15, v1, Lf1/t;->b:I

    .line 211
    .line 212
    sub-int/2addr v14, v15

    .line 213
    if-ge v14, v8, :cond_8

    .line 214
    .line 215
    invoke-virtual {v1, v2}, Lf1/t;->G(I)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_8
    invoke-virtual {v1, v8}, Lf1/t;->H(I)V

    .line 220
    .line 221
    .line 222
    :cond_9
    :goto_1
    iget v8, v1, Lf1/t;->c:I

    .line 223
    .line 224
    iget v14, v1, Lf1/t;->b:I

    .line 225
    .line 226
    sub-int/2addr v8, v14

    .line 227
    if-lt v8, v12, :cond_d

    .line 228
    .line 229
    iget-object v8, v1, Lf1/t;->a:[B

    .line 230
    .line 231
    invoke-static {v8, v14}, Lh2/a;->d([BI)I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eq v8, v13, :cond_d

    .line 236
    .line 237
    const/16 v14, 0x1b9

    .line 238
    .line 239
    if-ne v8, v14, :cond_a

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_a
    ushr-int/lit8 v8, v8, 0x8

    .line 243
    .line 244
    if-eq v8, v9, :cond_b

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_b
    invoke-virtual {v1, v12}, Lf1/t;->H(I)V

    .line 248
    .line 249
    .line 250
    iget v8, v1, Lf1/t;->c:I

    .line 251
    .line 252
    iget v14, v1, Lf1/t;->b:I

    .line 253
    .line 254
    sub-int/2addr v8, v14

    .line 255
    const/4 v14, 0x2

    .line 256
    if-ge v8, v14, :cond_c

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Lf1/t;->G(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_c
    invoke-virtual {v1}, Lf1/t;->A()I

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    iget v14, v1, Lf1/t;->c:I

    .line 267
    .line 268
    iget v15, v1, Lf1/t;->b:I

    .line 269
    .line 270
    add-int/2addr v15, v8

    .line 271
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    invoke-virtual {v1, v8}, Lf1/t;->G(I)V

    .line 276
    .line 277
    .line 278
    goto :goto_1

    .line 279
    :cond_d
    :goto_2
    iget v2, v1, Lf1/t;->b:I

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_e
    cmp-long v1, v10, v3

    .line 284
    .line 285
    if-eqz v1, :cond_f

    .line 286
    .line 287
    int-to-long v1, v2

    .line 288
    add-long v12, v5, v1

    .line 289
    .line 290
    new-instance v7, Ld2/g;

    .line 291
    .line 292
    const/4 v9, -0x2

    .line 293
    move-object v8, v7

    .line 294
    invoke-direct/range {v8 .. v13}, Ld2/g;-><init>(IJJ)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_f
    sget-object v7, Ld2/g;->d:Ld2/g;

    .line 299
    .line 300
    :goto_3
    return-object v7
.end method
