package com.qiniu.android.dns;

import java.io.IOException;

public interface IResolver {
    Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException;
}
