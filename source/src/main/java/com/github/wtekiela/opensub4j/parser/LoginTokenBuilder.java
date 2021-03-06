/**
 * Copyright (c) 2015 Wojciech Tekiela
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.github.wtekiela.opensub4j.parser;

import com.github.wtekiela.opensub4j.response.LoginToken;

class LoginTokenBuilder implements ResponseObjectBuilder<LoginToken> {

    private String token;

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public LoginToken build() {
        if (token == null) {
            throw new IllegalStateException("Token must be initialized!");
        }
        return new LoginToken(token);
    }

}
