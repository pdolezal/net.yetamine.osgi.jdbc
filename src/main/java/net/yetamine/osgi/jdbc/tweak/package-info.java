/*
 * Copyright 2016 Yetamine
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides support for tweaking the JDBC integration, e.g., by limiting the
 * weaving scope to the necessary minimum or to override the driver loading,
 * which occurs by default when the bundle becomes active.
 */
@org.osgi.annotation.versioning.Version("1.0.0")
package net.yetamine.osgi.jdbc.tweak;
